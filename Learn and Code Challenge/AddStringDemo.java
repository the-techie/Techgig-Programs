/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class AddStringDemo {
   public static void main(String args[]) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	String s1="Hello Techgig";
	String s2=sc.nextLine().toString();
	System.out.println(s1+"\n"+s2);
   }
}
