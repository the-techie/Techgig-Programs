/* 
First N First
-------------
Task : 
You will be given a string and you are asked to find the first character of the string. 

Input Format : 
You will be given a function with string as single argument. 

Output Format : 
You need to return the first character of the given string as a string to the STDOUT. 

Sample Test Case: 
Sample Input:
Hello Techgig

Sample Output: 
H 

*/

import java.util.*;
import java.io.*;
 
class FirstNFirst{
  public static String firstNFirst(String input1){
    //Write code here
    return input1.substring(0,1).toUpperCase();
  }
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    String output;
    String ip1 = in.nextLine().trim();
    output = firstNFirst(ip1);
    System.out.println(String.valueOf(output));
  }
}
}