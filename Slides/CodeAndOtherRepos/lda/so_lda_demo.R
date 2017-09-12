#Adapted based on https://www.r-bloggers.com/getting-started-with-latent-dirichlet-allocation-using-rtexttools-topicmodels/
#visualization based on http://tidytextmining.com/topicmodeling.html

library(RTextTools)
library(topicmodels)
library(tm)
library(tidytext)
library(ggplot2)
library(dplyr)

data <- read.csv("SO_QueryResults.csv")

matrix <- create_matrix(cbind(as.vector(data$Title)), language="english", removeNumbers=TRUE, stemWords=TRUE, weighting=weightTf)

so_lda <- LDA(matrix, 5)

terms(so_lda) #tells you the most frequent term in each topic
topics(so_lda) #tells you which topic each title is assigned to

##visualizing things better

so_lda_topics <- tidy(so_lda, matrix = "beta")
#so_lda_topics

so_lda_top_terms <- so_lda_topics %>%
  group_by(topic) %>%
  top_n(10, beta) %>%
  ungroup() %>%
  arrange(topic, -beta)

pdf("so_crypto_topics.pdf")
so_lda_top_terms %>%
  mutate(term = reorder(term, beta)) %>%
  ggplot(aes(term, beta, fill = factor(topic))) +
  geom_col(show.legend = FALSE) +
  facet_wrap(~ topic, scales = "free") +
  coord_flip()

dev.off()