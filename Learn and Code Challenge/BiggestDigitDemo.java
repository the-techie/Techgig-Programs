/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class BiggestDigitDemo {
   public static void main(String args[] ) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int tmp=num;
	int r=1,count=0;
	int rr=1;
	int tmpp=num;
	int tmp_1;
	int max;
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
	//sorting the array
	for(int p=0;p<count;p++){
		for(int q=0;q<count;q++){
			if(p!=q){
				if(arr[p]>arr[q]){
					tmp_1=arr[p];
					arr[p]=arr[q];
					arr[q]=tmp_1;
				}
			}
		}
	}
	max=arr[0];
	System.out.println(max);
	}
}
