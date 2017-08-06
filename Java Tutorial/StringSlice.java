/*
String Slice
------------
Task : 
You need to take string input and two other numbers which will be the start and end point of the slice and you need to print that slice of string. 

Input Format : 
You will be given a function with string and two other integers as arguments. 

Output Format : 
You need to return the slice of the string. 

Sample Test Case: 
Sample Input:
Hello Techgig
1
4

Sample Output: 
ello

*/

import java.util.*;
import java.io.*;
 
class StringSlice{
  public static String stringSlice(String input1,int input2,int input3){
    //Write code here
    return input1.substring(input2, input3+1);
  }

  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    String output;
    String ip1 = in.nextLine().trim();
    int ip2 = Integer.parseInt(in.nextLine().trim());
    int ip3 = Integer.parseInt(in.nextLine().trim());
    output = stringSlice(ip1,ip2,ip3);
    System.out.println(String.valueOf(output));
  }  
}
