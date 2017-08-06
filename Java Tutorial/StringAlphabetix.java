/*
String Alphabetics
------------------
Task :
You just need to take string input and checks whether the string consists of alphabetic characters only.

Input Format :
You will be given a function with a string as an argument.

Output Format :
You need to return the boolean value(either True or False).

Sample Test Case:
Sample Input:
this2009

Sample Output:
0
*/

import java.util.*;
import java.io.*;
class StringAlphabetix{
  public static boolean stringAlphabetics(String input1){
    // WITHOUT USING REGULAR EXPRESSIONS
    /*
    boolean returnStat = true;
    int len = input1.length();
    for(int i=0; i<len; i++){
      if(!Character.isLetter(input1.charAt(i))){
        returnStat = false;
        break;
      }
    }
    return returnStat;
    */

    if(input1.equals(input1.replaceAll("[^a-zA-Z]",""))){
      return true;
    }else{
      return false;
    }
  }
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    boolean output;
    String ip1 = in.nextLine().trim();
    output = stringAlphabetics(ip1);
    System.out.println(String.valueOf(output ? 1 : 0));
  }
}