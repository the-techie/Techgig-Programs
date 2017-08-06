/*
Numeric
-------
Task : 
You just need to take string input and checks whether the string consists of only numeric characters. 

Input Format : 
You will be given a function with string as single argument. 

Output Format : 
You need to return the boolean value(either True or False). 

Sample Test Case: 
Sample Input:
this20008 

Sample Output: 
0 
*/

import java.util.*;
import java.io.*;

class Numeric{
  public static boolean numeric(String input1){
    // WITHOUT USING REGULAR EXPRESSIONS
    /* 
    boolean returnStat = true;
    int len = input1.length();
    for(int i=0; i<len; i++){
      if(!Character.isDigit(input1.charAt(i))){
        returnStat = false;
        break;
      }
    }
    return returnStat;
    */
    
    if(input1.equals(input1.replaceAll("[^0-9]",""))){
      return true;
    }else{
      return false;
    }
  }

  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    boolean output;
    String ip1 = in.nextLine().trim();
    output = numeric(ip1);
    System.out.println(String.valueOf(output ? 1 : 0));
  }
}