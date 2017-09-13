# This script is based on Abram Hindle's R tutorial plus some online
# material from http://www.cyclismo.org/tutorial/R/input.html

# Basics
x <- 1 # assign 1 to x
square <- function(x) {  x * x } # square x
square(10) # 100


# Vectors in R
c(1:10) # vector for 1 to 10
x <- c(1:10)
x[1] # 1st
x[10] # 10th
x[c(1,5,10)] #get 1st, 5th and 10th
sort(x) # sort them
x[ 1:length(x) %% 2 > 0] # show odd indices
x[ 1:length(x) %% 2 > 0] <- 1 # assign odd indices to 1

# Strings in R
y <- "hello"
y <- c("hello", "world")

# load a CSV file
simple_data <- read.csv("simple.csv",header=T)

# get a summary of the data in the file
summary(simple_data)

# get the column names in your data set
names(simple_data)

# Access a particular column
simple_data$mass
simple_data$velocity

# factors
# notice the type column
summary(simple_data$type) #since this is not numeric data, the different levels are called "factors"

summary(simple_data$building) #this is actually encoding for different buildings, so it does not make sense to treat it as numeric
simple_data$building <- factor(simple_data$building)

# checking for normality
trial_a <- subset(simple_data, trial=="A")
