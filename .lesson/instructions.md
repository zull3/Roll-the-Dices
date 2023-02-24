# Data types - Roll the dice

## Instructions

Write a program that randomly rolls 3 dice and sums the value of the roll. The results of the 3 throws must be presented in a single line with a space between each value, and the sum of the throws is presented in a new line.

Tip! To randomize an integer that gives a value between 1 and n, you can write
```java
int number = 0; 
rand = (int) (Math.random () * n) +1;
```  

### Here is a brief explanation of the formula:
- Math.random () gives us a floating point number between 0.0 and 0.999 ... (0 <= x < 1)
- We multiply the floating point number by n = the largest number that can be randomized
  - Assume that n = 10, then we get a number between 0.0 -9.999 ...
- We want the number to be between 1-10 (not 0-9) so we add 1
  - then we get a number between 1.0 - 10.9999
- Finally, we are not interested in the decimals, so we cut them off by type-converting (cast) to an integer with: (int) (...)

Here is a more general example of random number generation within a certain range
```java
// define the range 
int max = 10; 
int min = 1; 
int range = 0;
int rand = 0;
range = max - min + 1; 

// generate random numbers within min(1) to max(10) 
rand = (int)(Math.random() * range) + min; 

// Output is different everytime this code is executed 
System.out.println(rand); 
```
