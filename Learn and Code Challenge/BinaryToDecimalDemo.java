/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class BinaryToDecimalDemo {
  public static void main(String args[]) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int bin=sc.nextInt();
	int dec=0;
	int count=0;
	int r=1,i=0;
	while(bin>0){
		r=bin%10;
		bin=bin/10;
		if(r==1){
			dec+=(int)Math.pow(2,i);
		}
		i++;
	}
		System.out.println(dec);
	}
}
