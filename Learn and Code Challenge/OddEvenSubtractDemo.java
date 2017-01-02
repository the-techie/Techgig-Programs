/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class OddEvenSubtractDemo {
   public static void main(String args[] ) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int r=1,count=0;
	int tmp=num;
	int rr=1;
	int tmpp=num;
	int odd_sum=0;
	int even_sum=0;
	int final_sub;
	//counting the number
	while(tmp>0){
		r=tmp%10;
		tmp=tmp/10;
		count++;
	}
	int arr[]=new int[count];
	//storing digits of the input number into an array
	for(int i=0;i<count;i++){
		rr=tmpp%10;
		tmpp=tmpp/10;
		arr[i]=rr;
	}
	for(int j=0;j<count;j++){
		if(arr[j]%2==0){
			even_sum+=arr[j];
		}else{
			odd_sum+=arr[j];
		}
	}
	if(odd_sum>even_sum){
		final_sub=odd_sum-even_sum;
	}else{
		final_sub=even_sum-odd_sum;
	}
	System.out.println(final_sub);
	}
}
