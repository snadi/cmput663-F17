fit_data <- subset(t, Fit=="yes")
shapiro.test(fit_data$Time)
shapiro.test(fit_data$Correct)

#alternative effect size calculation
library(effsize)
cliff.delta(c1, c2)
cohen.d(Correct[Fit=="yes"],Correct[Fit=="no"])

#for paired data
cohen.d(Fit,Text, paired=TRUE)
cliff.delta(Fit,Text,paired=TRUE)

#violin vs box plots

pdf("boxplot.pdf")
boxplot(Correct[Fit=="yes"], Correct[Fit=="no"],names=c("FIT","No Fit"))
dev.off()

library(vioplot)
pdf("violin.pdf")
vioplot(Correct[Fit=="yes"], Correct[Fit=="no"],names=c("FIT","No Fit"))
dev.off()
