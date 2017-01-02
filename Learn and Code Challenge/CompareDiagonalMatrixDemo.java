/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CompareDiagonalMatrixDemo{
   public static void main(String args[]) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int col=sc.nextInt();
	int tmp=0;
	int arr[][]=new int[row][col];
	int diag1=0, diag2=0;
	//adding data to the matrix
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			arr[i][j]=sc.nextInt();
		}
	}
	for(int p=0;p<row;p++){
		diag1+=arr[p][p];
	}
	for(int q=col-1;q>=0;q--){
		diag2+=arr[tmp][q];
		tmp++;
	}
	if(diag1>diag2){
		System.out.println("Diagonal 1");
	}
	else if(diag2>diag1){
		System.out.println("Diagonal 2");
	}
	else{
		System.out.println("Equal");
	}
	}
}
