#Source: https://www.r-bloggers.com/getting-started-with-latent-dirichlet-allocation-using-rtexttools-topicmodels/

library(RTextTools)
library(topicmodels)
library(tm)

data(NYTimes)
data <- NYTimes[sample(1:3100,size=1000,replace=FALSE),]

matrix <- create_matrix(cbind(as.vector(data$Title),as.vector(data$Subject)), language="english", removeNumbers=TRUE, stemWords=TRUE, weighting=weightTf)

k <- length(unique(data$Topic.Code))
lda <- LDA(matrix, k)

terms(lda)