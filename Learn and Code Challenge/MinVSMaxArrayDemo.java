/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class MinVSMaxArrayDemo {
   public static void main(String args[]) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int len=sc.nextInt();
	int[] arr=new int[len];
	int min,max;
	int tmp;
	for(int i=0;i<len;i++){
		arr[i]=sc.nextInt();
	}
	for(int j=0;j<len-1;j++){
		for(int k=j+1;k<len;k++){
			if(arr[j]>arr[k]){
				tmp=arr[j];
				arr[j]=arr[k];
				arr[k]=tmp;
			}
		}
	}
	max=arr[0];
	min=arr[len-1];
	System.out.println(max*min);
	}
}
