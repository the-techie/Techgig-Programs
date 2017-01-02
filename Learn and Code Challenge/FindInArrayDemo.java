/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class FindInArrayDemo {
   public static void main(String args[] ) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int len=sc.nextInt();
	int[] arr=new int[len];
	for(int i=0;i<len;i++){
		arr[i]=sc.nextInt();
	}
	int find=sc.nextInt();
	int ad;
	int found=0;
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(i==j){
					break;
				}
				ad=Math.abs(arr[i]+arr[j]);
				if(ad==find){
					found++;
					break;
				}
			}
		}
		if(found>0){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
}
