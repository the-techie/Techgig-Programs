/*
String Repetition
-----------------
Task : 
You just need to take a string and a integer as an input and repeat the string upto the count given as in integer. 

Input Format : 
You will be given a function with string and an integer as an argument. 

Output Format : 
You need to return the string from the given function. 

Sample Test Case: 
Sample Input:
Hello 
2

Sample Output: 
HelloHello 

*/

import java.util.*;
import java.io.*;
 
class StringRepeat{
  public static String stringsRepetition(String input1,int input2){
    //Write code here
    String finalString = "";
    while(input2>0){
      finalString += input1;
      input2--;
    }
    return finalString;
  }
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    String output;
    String ip1 = in.nextLine().trim();
    int ip2 = Integer.parseInt(in.nextLine().trim());
    output = stringsRepetition(ip1,ip2);
    System.out.println(String.valueOf(output));
  }
}


