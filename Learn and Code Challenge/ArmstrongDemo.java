/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class ArmstrongDemo {
   public static void main(String args[]) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int arm=0,r;
	int tmp=num;
	while(tmp>0){
		r=tmp%10;
		tmp=tmp/10;
		arm+=r*r*r;
	}
	if(num==arm){
		System.out.println("True");
	}
	else{
		System.out.println("False");
	}
   }
}
