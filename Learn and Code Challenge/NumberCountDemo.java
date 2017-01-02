/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class NumberCountDemo {
  public static void main(String args[] ) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	int len=0;
	while(number>0){
		number=number/10;
		len++;
	}
	System.out.println(len);
   }
}
