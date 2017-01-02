/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class MatrixRollDemo {
   public static void main(String args[]) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int[][] arr1=new int[x][y];
	//first matrix
	for(int i=0;i<x;i++){
		for(int j=0;j<y;j++){
			arr1[i][j]=sc.nextInt();
		}
	}
	//shifting the rows with columns
	int[][] arr2=new int[x][y];
	for(int i=0;i<x;i++){
		for(int j=0;j<y;j++){
			arr2[i][j]=arr1[j][i];
		}
	}
	//displaying the final matrix
	for(int i=0;i<x;i++){
		for(int j=0;j<y;j++){
			if(j==(y-1)){
				System.out.print(arr2[i][j]+"\n");
			}
			else{
				System.out.print(arr2[i][j]+" ");
			}
		}
	}	
	}
}
