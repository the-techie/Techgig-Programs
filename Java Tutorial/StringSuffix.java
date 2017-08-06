/*
String wit Suffix
-----------------
Task : 
You just need to take two strings as an input and check later string is the suffix of the former one. If yes, return 'True' else return 'False'. 

Input Format : 
You will be given a function with two strings as an arguments. 

Output Format : 
You need to return the boolean value(either True or False) to the STDOUT. 

Sample Test Case: 
Sample Input:
Hello Techgig
gig

Sample Output: 
1 

*/

import java.io.*;
import java.util.*;
class StringSuffix{
  public static boolean stringWithSuffix (String input1,String input2){
    //Write code here
    boolean count = false;
    int length1 = input1.length();
    int length2 = input2.length();
    int max = length1-length2;
    
    for(int i=0; i<=max; i++){
      if(input2.equals(input1.substring(i,i+length2))){
        count = true;
      }else{ // compiler showed errors so used this else loop
        count = false;
      }
    }
    return count;
  }
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    boolean output;
    String ip1 = in.nextLine().trim();
    String ip2 = in.nextLine().trim();
    output = stringWithSuffix (ip1,ip2);
    System.out.println(String.valueOf(output ? 1 : 0));
  }
  
}




