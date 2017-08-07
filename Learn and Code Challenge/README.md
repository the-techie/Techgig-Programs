**Techgig - Learn and Code Challenge**
====================

> **Official Link to "Learn and Code Challenge" :** https://www.techgig.com/challenge/learn-day1


----------

## Day 01 : Hello Techgig

### Task: 
For this code challenge, you need to read a line from stdin and store it to a variable, print 'Hello Techgig' and then on another line, print the variable's value. 

### Input Format: 
A single line to be taken as input and save it into a variable of your choice. 

### Output Format: 
Print 'Hello Techgig' and then content of the variable on another line. 

### Sample Test Case: 
#### Sample input:
    I am coming back to the race.

#### Sample Output:
    Hello Techgig 
    I am coming back to the race.

### Explanation: 
For the first Line, we are printing the string literal 'Hello Techgig'. On another line, we are printing the content of the variable. To pass all the test cases, you need to print all the content of the variable to stdout.


----------

> **Solution :** [AddStringDemo.java](AddStringDemo.java)

----------

## Day 02 : Exploring Data Types

### Task: 
For this challenge, you need to read a line from stdin and check whether it is of type integer, float or string. 
If input is 
- Integer print 'This input is of type Integer.' to the stdout 
- Float print 'This input is of type Float.' to the stdout 
- String print 'This input is of type string.' to the stdout 
- else print 'This is something else.' to the stdout. 

### Input Format: 
A single line to be taken as input as save it to a variable(name of your choice). 

### Output Format: 
Print the text according to the data type you get as an input. 

### Sample Test Case:
#### Sample Input:
    23

#### Sample Output: 
    This input is of type Integer.

### Explanation: 
If the given input is of type integer, then you need to print 'This input is of type Integer.' to the stdout, else if the given input is of type float, then you need to print 'This input is of type Float.' to the stdout, else if the given input is of type string, then you need to print 'This input is of type string' to the stdout, else print 'This is something else' to the stdout.


----------

> **Solution :** [GetClassDemo.java](GetClassDemo.java)

----------

## Day 03 : Play with Operators

### Task: 
For this challenge, you will be given the values of principal, interest and year. You need to calculate the simple interest, round it to the nearest integer and print it. 

### Input Format: 
There will be 3 lines of numeric input 
- principal which is of type double. 
- interest which is of type integer. 
- year which is again of type integer. 

### Output Format: 
Just print the simple interest value after performing the calculation using the formula to the stdout. The result should be an integer. 

### Sample Test Case:
#### Sample Input: 
    100 
    3 
    2

#### Sample Output: 
    6

### Explanation: 
Given the value of principal, interest and year. You can calculate the simple interest using the formula 
Sample Interest = (principal * interest * year)/100 
Round the value to the nearest integer and print it.

----------

> **Solution :** [SimpleInterestDemo.java](SimpleInterestDemo.java)

----------

## Day 04 : Decide yourself with Conditional Statement

### Task: 
For this challenge, you need to read a integer value(default name - age) from stdin, store it in a variable and then compare that value with the conditions given below - 
- if age is less than 10, then print 'I am happy as having no responsibilities.' to the stdout. 
- if age is equal to or greater than 10 but less than 18, then print 'I am still happy but starts feeling pressure of life.' to the stdout. 
- if age is equal to or greater than 18, then print 'I am very much happy as i handled the pressure very well.' to the stdout. 

### Input Format: 
A single line to be taken as input and save it into a variable of your choice(Default name - age). 

### Output Format: 
Print the sentence according to the value of the integer which you had taken as an input. 

### Sample Test Case:
#### Sample Input: 
    10

#### Sample Output:
    I am still happy but starts feeling pressure of life.

### Explanation:
The value of the variable is 10 and it comes under the condition that it equal to or greater than 10 but less than 18.


----------

> **Solution :** [ConditionalsDemo.java](ConditionalsDemo.java)

----------

## Day 05 : Loop your World

### Task: 
For this challenge, you need to take an integer value as input from stdin, calculate its factorial and print the result to the stdout. 

### Input Format: 
A single integer value to be taken as input from stdin and stored it in a variable of your choice. 

### Output Format: 
Print the value which you will get after calculating the factorial of the input. 

### Sample Test Case:
#### Sample Input: 
    5

#### Sample Output: 
    120

### Explanation: 
For a number, we will calculate its factorial by multiplying the number with the numbers which comes between 1(inclusive) and the number itself. 
For input as 5, its factorial will be 1*2*3*4*5 = 120. 
factorial of n (n!) = 1*2*3*4....n


----------

> **Solution :** [FactorialDemo.java](FactorialDemo.java)

----------

## Day 06 : How much Big is your Number?

### Task: 
For this challenge, you will take an integer input from stdin, store it in a variable and  calculate the number of digits in the number using division operator. 

### Input Format: 
A single integer value to be taken as input from stdin and stored it in a variable of your choice. 

### Output Format: 
Print the value which you will get after calculating the number of digits. 

### Sample Test Case:
#### Sample Input: 
    34567

#### Sample Output: 
    5

### Explanation: 
Every time you divide the input number by 10, one digit get reduced and you need to maintain a count of that until the input number reduced to 0. The count value is your answer. 
34567/10 = 3456   count = 1 
3456/10 = 345     count = 2 
345/10 = 34       count = 3 
34/10 = 3         count = 4 
3/10 = 0          count = 5


----------

> **Solution :** [NumberCountDemo.java](NumberCountDemo.java)

----------

## Day 07 : Count Special Numbers between Boundaries

### Task:
For this challenge, you are given a range and you need to find how many prime numbers lying between the given range. 

### Input Format: 
For this challenge, you need to take two integers on separate lines. These numbers defines the range. 

### Output Format: 
output will be the single number which tells how many prime numbers are there between given range. 

### Sample Test Case:
#### Sample Input: 
    3 
    21

#### Sample Output: 
    7

### Explanation: 
There are 7 prime numbers which lies in the given range. 
They are 3, 5, 7, 11, 13, 17, 19

----------

> **Solution :** [PrimeCountDemo.java](PrimeCountDemo.java)

----------

## Day 08 : Is you Number Armstrong?

### Task: 
For this challenge, you need to take an integer input and store it in a variable of your choice and checks whether this number is an Armstrong number or not. If yes print 'True' else print 'False'. 

### Input Format: 
A single integer value to be taken as input from stdin and stored it in a variable. 

### Output Format:
print 'True' if your number is Armstrong otherwise print 'False' to the stdout. 

### Sample Test Case:
####Sample Input: 
    153

#### Sample Output: 
    True

### Explanation:
First of all, what is a Armstrong Number? 
An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. 

For example, take the number 153 
153 = 1^3 + 5^3 + 3^3 
So, this is a Armstrong Number. 

Take Another Example, now the number is 372 
372 != 3^3 + 7^3 + 2^3


----------

> **Solution :** [ArmstrongDemo.java](ArmstrongDemo.java)

----------

## Day 09 : Is you number Narcissistic?

### Task: 
For this challenge, you will take an integer input and store it in a variable and checks whether the input number is a Narcissistic number or not. If it is, then print 'True' else print 'False'. 

### Input Format: 
A single integer value to be taken as input from stdin and stored it in a variable of your choice. 

### Output Format: 
print 'True' if your number is Narcissistic otherwise print 'False' to the stdout. 

### Sample Test Case:
#### Sample Input: 
    1634

#### Sample Output: 
    True

### Explanation: 
First of all, what is a Narcissistic Number? 
An n-digit number that is the sum of the nth powers of its digits is called an n-narcissistic number. 

For example, take the number 1634 
1634 = 1^4 + 6^4 + 3^4 + 4^4 
So, this is a Narcissistic Number. 

Take Another Example, now the number is 372 
372 != 3^3 + 7^3 + 2^3


----------

> **Solution :** [NarcissisticDemo.java](NarcissisticDemo.java)

----------

## Day 10 : Who is the Second Largest? 

### Task: 
For this challenge, you need to take number of elements as input on one line and array elements as an input on another line and find the second largest array element and print that element to the stdout. 

### Input Format: 
In this challenge, you will take number of elements as input on one line and array elements which are space separated as input on another line. 

### Output Format: 
You will print the second largest element to the stdout. 

### Sample Test Case:
#### Sample Input: 
    5 
    23 11 24 13 55

#### Sample Output:
    24

### Explanation: 
Of all the given elements, search the second largest element.

----------

> **Solution :** [SecondLargestDemo.java](SecondLargestDemo.java)

----------

## Day 11 : Count the Letters

----------

> **Solution :** [StringCounterDemo.java](StringCounterDemo.java)

----------

## Day 12 : Patch Up two Matrices

----------

> **Solution :** [MatrixAdditionDemo.java](MatrixAdditionDemo.java)

----------

## Day 13 : Roll your Matrix

----------

> **Solution :** [MatrixRollDemo.java](MatrixRollDemo.java)

----------

## Day 14 : Let's Make a Dictionary Order

----------

> **Solution :** [DictionaryLexicalDemo.java](DictionaryLexicalDemo.java)

----------

## Day 15 : Calculate Power using Recursion 

----------

> **Solution :** [PowerRecursionDemo.java](PowerRecursionDemo.java)

----------

## Day 16 : GCD of Two Numbers

----------

> **Solution (i) :** [GCDDemo.java](GCDDemo.java)
>
> **Solution (ii) :** [GCDDemo2.java](GCDDemo2.java)
>
> **Solution (iii) :** [GCDEuclideanDemo.java](GCDEuclideanDemo.java) - [Euclidean Method](https://en.wikipedia.org/wiki/Euclidean_algorithm)
>
> **Solution (iv) :** [GCDRecursionDemo.java](GCDRecursionDemo.java) - Recursion Method

----------

## Day 17 : Find Pairs in Array

----------

> **Solution :** [FindInArrayDemo.java](FindInArrayDemo.java)

----------

## Day 18 : Minimum Effort - Maximum Output

----------

> **Solution :** [SortingSubArrayDemo.java](SortingSubArrayDemo.java)

----------

## Day 19 : Binary to Decimal

----------

> **Solution :** [BinaryToDecimalDemo.java](BinaryToDecimalDemo.java)

----------

## Day 20 : Star Pattern

----------

> **Solution :** [CylinderStarPatternDemo.java](CylinderStarPatternDemo.java)

----------

## Day 21 : Multiply Sum of Odds with Sum of Evens

----------

> **Solution :** [AddProductOddEvenDemo.java](AddProductOddEvenDemo.java)

----------

## Day 22 : War between Odd and Even

----------

> **Solution :** [AddSubtractOddEvenDemo.java](AddSubtractOddEvenDemo.java)

----------

## Day 23 : Maximum vs. Minimum

----------

> **Solution :** [MinVSMaxArrayDemo.java](MinVSMaxArrayDemo.java)

----------

## Day 24 : Average Odd Even Demo

----------

> **Solution :** [AverageOddEvenDemo.java](AverageOddEvenDemo.java)

----------

## Day 25 : Consecutive Array

----------

> **Solution :** [ConsecutiveArrayDemo.java](ConsecutiveArrayDemo.java)

----------

## Day 26 : Biggest Digit in a Number

----------

> **Solution :** [BiggestDigitDemo.java](BiggestDigitDemo.java)

----------

## Day 27 : Play with Digits of a Number

----------

> **Solution :** [OddEvenSubtractDemo.java](OddEvenSubtractDemo.java)

----------

## Day 28 : Compare two Numbers

----------

> **Solution :** [CompareSumOfDigitsDemo.java](CompareSumOfDigitsDemo.java)

----------

## Day 29 : Comparing diagonals of a Matrix

----------

> **Solution :** [CompareDiagonalMatrixDemo.java](CompareDiagonalMatrixDemo.java)

----------

## Day 30 : Comparing Rows of a Matrix

----------

> **Solution :** [CompareMatrixRowsDemo.java](CompareMatrixRowsDemo.java)



