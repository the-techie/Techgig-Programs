/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class PrimeCountDemo {
   public static void main(String args[] ) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	//p1 should be > 1 because 1 is neither prime nor composite
	int p1=sc.nextInt();
	int p2=sc.nextInt();
	int count=0;
	int prime=0;
	for(int j=p1; j<=p2; j++){
		for(int i=2; i<=j; i++){
			if(j%i==0){
				count++;
			}
			if(count>1){
				count=0;
				break;
			}
		}
		if(count==1){
			prime++;
		}
	}
	System.out.println(prime);
	}
}
