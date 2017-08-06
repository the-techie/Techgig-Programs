/*
Title
------
Task :
You just need to take string input and checks whether all the case-based characters in the string following non-casebased letters. Non-casebased letters are uppercase and all other case-based characters are lowercase.

Input Format :
You will be given a function with string as single argument.

Output Format :
You need to return the boolean value(either True or False).

Sample Test Case:
Sample Input:
This Is String Example

Sample Output:
1
*/

import java.util.*;
import java.io.*;

class TitleCase{
  public static boolean title(String input1){
    //Write code here
    boolean returnStat = true;
    String[] input2 = input1.split(" ");
    String firstUpper = "";
    for(int i=0; i<input2.length; i++){
      firstUpper = input2[i].substring(0,1).toUpperCase()+input2[i].substring(1).toLowerCase();
      if(input2[i].equals(firstUpper)){
        returnStat = true;
      }else{
        returnStat = false;
        break;
      }
    }
    return returnStat;
  }
  
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    boolean output;
    String ip1 = in.nextLine().trim();
    output = title(ip1);
    System.out.println(String.valueOf(output ? 1 : 0));
  }
}



