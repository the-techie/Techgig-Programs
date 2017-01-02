/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class NarcissisticDemo {
  public static void main(String args[]) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int nar=0,r;
	int tmp=num;
	int tmpp=num;
	int tmpr=1;
	int tmprr=1;
	int count=0;
	int countr=0;

	//counting the number of digits
	while(tmpr>0){
		tmpr=tmpp/10;
		tmpp=tmpp/10;
		countr++;
	}
	count=countr;
	while(tmp>0){
		r=tmp%10;
		tmp=tmp/10;
		//determining n in r^n
		while(count>0){
			tmprr*=r;
			count--;
		}
		nar+=tmprr;
		//resetting values
		tmprr=1;
		count=countr;
	}

	if(num==nar){
		System.out.println("True");
	}
	else{
		System.out.println("False");
	}
	}
}
