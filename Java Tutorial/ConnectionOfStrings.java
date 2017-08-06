/* 
Connection Of Strings
---------------------
Task : 
You just need to take two strings as input and concatenate them and print the concatenated string. 

Input Format : 
You will be given a function with two strings as arguments. 

Output Format : 
You need to return the concatenated string from the given function. 

Sample Test Case: 
Sample Input:
Hello 
Techgig

Sample Output: 
HelloTechgig 

*/
import java.util.*;
import java.io.*;

class ConnectionOfStrings{
  public static String connectionOfStrings(String input1,String input2){
    //Write code here
    return input1.concat(input2);
  }
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    String output;
    String ip1 = in.nextLine().trim();
    String ip2 = in.nextLine().trim();
    output = connectionOfStrings(ip1,ip2);
    System.out.println(String.valueOf(output));
  }
}
