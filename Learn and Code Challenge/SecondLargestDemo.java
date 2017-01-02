/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class SecondLargestDemo {
   public static void main(String args[] ) throws Exception {
	//Write code here
	int tmp,k=0;
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int[] arr=new int[num];
		for(int i=0; i<num; i++){
			arr[i]=sc.nextInt();
		}
		while(k<num){
			for(int j=0; j<num-1; j++){
				if(arr[j]<arr[j+1]){
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
			k++;
		}
		/* sorted array
		System.out.print("[");
		for(int i=0; i<num; i++){
			System.out.print(" "+arr[i]);
		}
		System.out.print(" ]"); 
		*/
		System.out.println(arr[1]);
	}
}
