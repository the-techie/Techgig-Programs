/*
Membership In Strings
---------------------
Task : 
You just need to take string and a character as an input and return 'True' if that character is present in that string otherwise return 'False'. 

Input Format : 
You will be given a function with two strings as an arguments 

Output Format : 
return 'True' if that character is present in that string otherwise return 'False'. 

Sample Test Case: 
Sample Input:
Hello Techgig 
H

Sample Output: 
True

*/

import java.util.*;
import java.io.*;

class MemberInString{
  public static boolean  membershipInStrings(String input1,String input2){
    //Write code here
    if(input1.indexOf(input2) >= 0){
      return true;
    }else{
      return false;
    }
  }
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    boolean output;
    String ip1 = in.nextLine().trim();
    String ip2 = in.nextLine().trim();
    output = membershipInStrings(ip1,ip2);
    System.out.println(String.valueOf(output ? 1 : 0));
  }
}

