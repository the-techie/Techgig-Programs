/*
First Capitalizing in String
----------------------------
Task : 
You just need to take string input and return the string by capitalizing the first character of the string. 

Input Format : 
You will be given a function with string as single argument. 

Output Format : 
You need to return the string from the given function. 

Sample Test Case: 
Sample Input:
hello Techgig

Sample Output: 
Hello Techgig 

*/

import java.util.*;
import java.io.*;

class FirstCapitalString{
  public static String firstCapitalizingInStrings(String input1){
    //Write code here
    String modifiedString = input1.substring(0,1).toUpperCase()+input1.substring(1);
    return modifiedString;
  }
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    String output;
    String ip1 = in.nextLine().trim();
    output = firstCapitalizingInStrings(ip1);
    System.out.println(String.valueOf(output));
  }
}



