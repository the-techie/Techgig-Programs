/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class SortingSubArrayDemo {
   public static void main(String args[] ) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int len=sc.nextInt();
	int[] arr=new int[len];
	for(int i=0;i<len;i++){
		arr[i]=sc.nextInt();
	}
	int count=0;
	int min=0, max=0;
//using labelled breaks
	outerloop1:
	for(int i=0;i<len;i++){
		for(int j=i+1;j<len;j++){
			if(arr[i]>arr[j]){
				min=i;
				break outerloop1;
			}
			else{
				continue;
			}
		}
	}
	//using labelled breaks
	outerloop2:
	for(int k=len-1;k>0;k--){
		for(int l=k-1;l>0;l--){
			if(arr[k]<arr[l]){
				max=k;
				break outerloop2;
			}
			else{
				continue;
			}
		}
	}
	for(int x=min;x<=max;x++){
		System.out.print(arr[x]);
		if(x!=max){
			System.out.print(" ");
		}
	}
	}
}
