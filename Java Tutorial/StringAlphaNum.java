/*
String Alpha Numeric
--------------------
Task :
You just need to take string input and checks whether the string consists of alphanumeric characters.

Input Format :
You will be given a function with string as an argument.

Output Format :
You need to return the boolean value(either True or False).

Sample Test Case:
Sample Input:
this2009

Sample Output:
1

*/

import java.util.*;
import java.io.*;
class StringAlphaNum{
  public static boolean stringAlphanumeric(String input1){

    // WITHOUT USING REGULAR EXPRESSIONS
    /* 
    boolean returnStat = false;
    int len = input1.length();
    for(int i=0; i<len; i++){
      if(Character.isDigit(input1.charAt(i))){
        returnStat = true;
        break;
      }
    }
    return returnStat;
    */
    
    if(input1.equals(input1.replaceAll("[0-9]",""))){
      return false;
    }else{
      return true;
    }
  }
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    boolean output;
    String ip1 = in.nextLine().trim();
    output = stringAlphanumeric(ip1);
    System.out.println(String.valueOf(output ? 1 : 0));
  }
}



