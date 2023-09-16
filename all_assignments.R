num_gold <- 20
num_silver <- 30
num_bronze <- 50

total <- num_gold+num_silver+num_bronze
chest <- c(rep("GOLD",num_gold),rep("SILVER",num_silver),rep("BRONZE",num_bronze))
sample_space <- sample(chest,size = 10,replace = FALSE)

print(sample_space)

success <- 0.9

failure <- 0.1
sample_space <- sample(c("success","failure"),10,replace = TRUE, prob = c(success,failure))
print(sample_space)

conditional_probability <- function(prob_a,prob_b, prob_A_given_B) {
  prob_B_given_A <- (prob_A_given_B * prob_b) / prob_a
  return(prob_B_given_A)
}


prob_cloudy <- 0.4
prob_rain <- 0.2
prob_cloudy_given_rain <- 0.85


prob_rain_given_cloudy <- conditional_probability(prob_cloudy, prob_rain, prob_cloudy_given_rain)
prob_rain_given_cloudy

modes <- function(data_vector){
  unique_values <- table(data_vector)
  max_freq <- max(unqiue_values)
  modeee <- as.numeric(names(unique_values[unique_values == max_freq]))
  return(modeee)
  
}

p <- 1/6
n <- 12

less_than_seven <- pbinom(7,size =n, prob = p,lower.tail = FALSE)
less_than_nine <- pbinom(9,size = n, prob = p, lower.tail=FALSE)
between_sevon_and_nine <- less_than_nine - less_than_seven
print(between_sevon_and_nine)

threshold <- 84
probab <- pnorm(threshold,mean = 72,sd= 15.2)*100
print(probab)

lambda <- 5
prob_no_car <- dpois(0,lambda)

prob_less_50 <- ppois(50,lambda_y)
prob_less_47 <-ppois(47,lambda_y)

result <- prob_less_50 - prob_less_47
print(result)

total <- 50
defective <- 17
sample_size < 5

prob_3_defective <- dhyper(3,m=defective,n = total- defective,k<-sample_size)
print(prob_3_defective)

sample_size <- 31
p <- 0.447
x_values <- 0:n
pmf_values <- dbinom(x_values, size = n, prob = p)


#q1
x <- c(0, 1, 2, 3, 4)
p <- c(0.41, 0.37, 0.16, 0.05, 0.01)
expval<-sum(x*p)
expval
expected_value<-weighted.mean(x,p)
expected_value
exp_val<-c(x%*%p)
exp_val

#q2
f<-function(t){
  return (t*(0.1*exp(-0.1*t)))
}
exp_value<-integrate(f, lower = 0, upper = Inf)
exp_value
print(exp_value$value)

#q3
x<-c(0,1,2,3)
px<-c(0.1,0.2,0.2,0.5)
expec_value<-sum(px*((12*x)-(2*(3-x))))
expec_value

#q4

m1<- integrate(f1, lower = 1, upper = 10)$value #$value is used to remove the error shown in the answer
cat("First moment is",m1)
m2<- integrate(f2, lower = 1, upper = 10)$value
cat("Second moment is",m2)
mean<-m1
cat("Mean is",mean)
var<-m2-m1*m1
cat("variance is",var)

#q5 case of discrete therefore sum will be used and not integration
f3<-function(y){
  return (3/4)*(1/4)^(sqrt(y)-1)
}
x=3
y<-x^2
py<-f3(y)
py

x<-c(1,2,3,4,5)
y<-x^2
expval<-sum(y*f3(y))
expval

var<-sum(y^2*f3(y))-(expval)^2
var