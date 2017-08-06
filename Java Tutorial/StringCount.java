/*
String Counting
---------------
Task : 
You just need to take two strings as an input and count how many times later string comes in the former one. Return the count. 

Input Format : 
You will be given a function with two strings as an argument. 

Output Format : 
You need to return the count from the given function. 

Sample Test Case: 
Sample Input:
Hello Techgighg
hg

Sample Output: 
2 
*/

import java.io.*;
import java.util.*;
class StringCount{
  public static int stringCounting(String input1,String input2){
    //Write code here
    int count = 0;
    int length1 = input1.length();
    int length2 = input2.length();
    int max = length1-length2;
    
    for(int i=0; i<=max; i++){
      if(input2.equals(input1.substring(i,i+length2))){
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    int output = 0;
    String ip1 = in.nextLine().trim();
    String ip2 = in.nextLine().trim();
    output = stringCounting(ip1,ip2);
    System.out.println(String.valueOf(output));
  }
}



