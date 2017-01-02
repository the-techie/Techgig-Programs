/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class ConsecutiveArrayDemo {
   public static void main(String args[] ) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int len=sc.nextInt();
	double[] arr=new double[len];
	int count=0;
	for(int i=0;i<len;i++){
		arr[i]=sc.nextInt();
	}
	for(int j=0;j<len-1;j++){
		if(arr[j+1]==(arr[j]+1)){
			count++;
		}
	}
	if(count==len-1){
		System.out.println("True");
	}
	else{
		System.out.println("False");
	}
	}
}
