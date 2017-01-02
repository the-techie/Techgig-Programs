/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class GCDDemo {
   public static void main(String args[] ) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int min;
	int gcd=0;
	if(n1>n2){
		min=n2;
	}else{
		min=n1;
	}
	for(int i=min;i>=1;i--){
		if(n1%i==0 && n2%i==0){
			gcd=i;
			break;
		}
	}
	System.out.println(gcd);
	}
}
