/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class AddSubtractOddEvenDemo {
   public static void main(String args[] ) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int len=sc.nextInt();
	int[] arr=new int[len];
	int odd=0, even=0;
	for(int i=0;i<len;i++){
		arr[i]=sc.nextInt();
	}
	for(int j=0;j<len;j++){
		if(j%2==0){
			even+=arr[j];
		}else{
			odd+=arr[j];
		}
	}
	if(odd>even){
		System.out.println(odd-even);
	}
	else{
		System.out.println(even-odd);
	}
	}
}
