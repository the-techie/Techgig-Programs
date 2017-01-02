/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class AverageOddEvenDemo {
   public static void main(String args[]) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int len=sc.nextInt();
	int[] arr=new int[len];
	double odd=0,even=0;
	double odd_count=0,even_count=0;
	double odd_avg;
	double even_avg;

	for(int i=0;i<len;i++){
		arr[i]=sc.nextInt();
	}
	for(int j=0;j<len;j++){
		if(arr[j]%2==0){
			even+=arr[j];
			even_count++;
		}
		else if(arr[j]%2!=0){
			odd+=arr[j];
			odd_count++;
		}
	}
	even_avg=Math.round(even/even_count);
	odd_avg=Math.round(odd/odd_count);
	int final_sum=(int)(odd_avg+even_avg);
	System.out.println(final_sum);
	}
}
