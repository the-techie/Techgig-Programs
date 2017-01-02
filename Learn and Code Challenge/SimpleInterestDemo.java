/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class SimpleInterestDemo {
  public static void main(String args[] ) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	double principal= sc.nextDouble();
	int interest= sc.nextInt();
	int year= sc.nextInt();
	int simpleInterest= (int)((principal*interest*year)/100);
	System.out.println(simpleInterest);
   }
}
