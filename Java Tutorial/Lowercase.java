/*
Lowercase
---------
Task : 
You just need to take string input and checks whether all the case-based characters (letters) of the string are lowercase. 

Input Format : 
You will be given a function with string as an argument. 

Output Format : 
You need to return the boolean value(either True or False). 

Sample Test Case: 
Sample Input:
this 

Sample Output: 
1 

*/

import java.util.*;
import java.io.*;

class Lowercase{
  public static boolean lowerCase(String input1){
    //Write code here
    if(input1.equals(input1.toLowerCase())){
      return true;
    }else{
      return false;
    }
  }
  
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    boolean output;
    String ip1 = in.nextLine().trim();
    output =  lowerCase(ip1);
    System.out.println(String.valueOf(output ? 1 : 0));
  }
  
}





