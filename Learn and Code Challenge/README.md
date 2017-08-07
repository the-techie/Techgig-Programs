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
#### Sample Input: 
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

### Task: 
For this challenge, you need to take a string as an input from the stdin, count the number of uppercase and lowercase letters and print them to the stdout. 

### Input Format: 
A single line of string to be taken as an input and store it in a variable of your choice. 

### Output Format: 
print the number of uppercase letters on one line and number of lowercase letters on another side. 

### Sample Test Case:
#### Sample Input: 
    Techgig Is The Best Coding Platform.

#### Sample Output: 
    6 
    24

### Explanation: 
For the above string which is taken as input, it has 6 uppercase letters which is displayed on one line and 24 lowercase letters which is displayed on another line.

----------

> **Solution :** [StringCounterDemo.java](StringCounterDemo.java)

----------

## Day 12 : Patch Up two Matrices

### Task: 
For this challenge, you need to take 2 matrices as an input from the stdin , add them and print the resultant matrix to the stdout. 

### Input Format: 
Two matrices to be taken as an input. 

For each matrix, on first line you need to tell that how many rows and columns your matrix need to have and these values should be separated by space. 

Then after that, each line will represent will represent each row and you need to enter numbers which each rows should have separated by a space. 

### Output Format: 
print the resultant matrix to the stdout where each each line should represent each row and values in the row should be separated by a space. 

### Sample Test Case:
#### Sample Input: 
    3 3 
    1 2 3 
    4 5 6 
    7 8 9 
    3 3 
    2 3 4 
    5 6 7 
    7 8 9

#### Sample Output: 
    3 5 7 
    9 11 13 
    14 16 18

### Note: 
Please do not include space after the numbers which are in the last column as it will affect your submission and you will not get marks. 

### Explanation: 
Two matrices must have an equal number of rows and columns to be added. The sum of two matrices A and B will be a matrix which has the same number of rows and columns as do A and B. The sum of A and B, denoted A + B, is computed by adding corresponding elements of A and B.


----------

> **Solution :** [MatrixAdditionDemo.java](MatrixAdditionDemo.java)

----------

## Day 13 : Roll your Matrix

### Task: 
For this challenge, you need to take a matrix as an input from the stdin , transpose it and print the resultant matrix to the stdout. 

### Input Format: 
A matrix is to be taken as input from stdin.On first line you need to tell that how many rows and columns your matrix need to have and these values should be separated by space. Below lines will represent the elements of the matrix where each line will represent the row of the matrix.

### Output Format: 
Print the resultant matrix to the stdout where each line should represent each row and values in the row should be separated by a space. 

### Sample Test Case:
#### Sample Input: 
    3 3 
    1 2 3 
    4 5 6 
    7 8 9

#### Sample Output: 
    1 4 7 
    2 5 8 
    3 6 9

### Explanation: 
The transpose of a matrix is a new matrix whose rows are the columns of the original.

----------

> **Solution :** [MatrixRollDemo.java](MatrixRollDemo.java)

----------

## Day 14 : Let's Make a Dictionary Order

### Task: 
You need to input N words one on each line and output should be lexicographically sorted i.e the words which comes as a output should be lexicographically sorted. 

### Input Format: 
You will be taking an integer N from STDIN. 
Following N lines contains string one on each line. 

### Output Format: 
The words should be lexicographically sorted and should be displayed one per each line. 

### Sample Test Case: 
#### Sample Input: 
    10 
    fortran 
    java 
    perl 
    python 
    php 
    javascript 
    c 
    cpp 
    ruby 
    csharp

#### Sample Output: 
    c 
    cpp 
    csharp 
    fortran 
    java 
    javascript 
    perl 
    php 
    python 
    ruby

### Explanation: 
In mathematics, the lexicographic or lexicographical order (also known as lexical order, dictionary order, alphabetical order or lexicographical product) is a generalization of the way the alphabetical order of words is based on the alphabetical order of their component letters.

----------

> **Solution :** [DictionaryLexicalDemo.java](DictionaryLexicalDemo.java)

----------

## Day 15 : Calculate Power using Recursion 

### Task: 
This program takes two integers from user ( base number and a exponent) and calculates the power. Instead of using loops to calculate power, this program uses recursion to calculate the power of a number. 

### Input Format: 
For this challenge, you need to take 2 integer inputs from stdin which are separated by a single space. 

### Output Format: 
You will print the answer to the stdout. 

### Sample Test Case: 
#### Sample Input: 
    3 3

#### Sample Output: 
    27

### Explanation: 
    3^3 = 3*3*3 = 27

----------

> **Solution :** [PowerRecursionDemo.java](PowerRecursionDemo.java)

----------

## Day 16 : GCD of Two Numbers

### Task:
For this challenge, you need to take input of two numbers , calculate their greatest common divisor(GCD) and print it to the stdout. 

### Input Format: 
You need to take two integers as an input which are separated by a single space. 

### Output Format: 
print the single integer result to the stdout. 

### Sample Test Case: 
#### Sample Input: 
    81 153

#### Sample Output: 
    9

### Explanation:
81 = 3*3*3*3
153 = 3*3*17
so common to both is 3*3 which is 9.

---------

> **Solution (i) :** [GCDDemo.java](GCDDemo.java)
>
> **Solution (ii) :** [GCDDemo2.java](GCDDemo2.java)
>
> **Solution (iii) :** [GCDEuclideanDemo.java](GCDEuclideanDemo.java) - [Euclidean Method](https://en.wikipedia.org/wiki/Euclidean_algorithm)
>
> **Solution (iv) :** [GCDRecursionDemo.java](GCDRecursionDemo.java) - Recursion Method

----------

## Day 17 : Find Pairs in Array

### Task: 
For this challenge, you need to take array and an integer as an input, check for pair in array with sum as that of an integer and if you find those two numbers in the array return true else return false. 

### Input Format: 
You need to take an integer input on first line which tells about the size of the array.Another line will have array elements separated by spaces. Last line will have an integer input that defines the number for which the pair has to be searched in the array. 

### Output Format: 
print 'True' if the pair found in the array element else print 'False' to the stdout. 

### Sample Test Case: 
#### Sample Input: 
    6 
    14 45 6 10 -8
    16

#### Sample Output:
    True

----------

> **Solution :** [FindInArrayDemo.java](FindInArrayDemo.java)

----------

## Day 18 : Minimum Effort - Maximum Output

### Task: 
For this challenge, Given an unsorted array arr[0..n-1] of size n, find the minimum length subarray arr[s..e] such that sorting this subarray makes the whole array sorted. 

### Input Format: 
On the first line, you need to take an integer input which will be the length of the array. Another line will have space separated integer values. 

### Output Format: 
space separated integer values present in the subarray. 

### Sample Test Case: 
#### Sample Input: 
    11 
    10 12 20 30 25 40 32 31 35 50 60

#### Sample Output: 
    30 25 40 32 31 35

### Explanation:
You are given an array and you need to find a subarray that if you sorted the whole array got sorted.

----------

> **Solution :** [SortingSubArrayDemo.java](SortingSubArrayDemo.java)

----------

## Day 19 : Binary to Decimal

### Task: 
You will be getting a binary number as an input and you need to convert it into a decimal number. 

### Input Format: 
you will be taking a binary number as an input. 

### Output Format: 
print the decimal number to the stdout. 

### Sample Test case: 
#### Sample Input: 
    111

#### Sample Output: 
    7

### Explanation:
This is a traditional conversion which needs to be implemented in programming.

----------

> **Solution :** [BinaryToDecimalDemo.java](BinaryToDecimalDemo.java)

----------

## Day 20 : Star Pattern

### Task: 
You need to print the following pattern

    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *

### Input Format: 
    none 

### Output Format:
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *

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



