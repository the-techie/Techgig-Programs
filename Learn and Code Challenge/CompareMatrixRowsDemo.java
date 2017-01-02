/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CompareMatrixRowsDemo{
   public static void main(String args[]) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int col=sc.nextInt();
	int arr[][]=new int[row][col];
	int row_sum1=0, row_sum2=0;
	int count=0, count_eq=0;

	//adding data to the matrix
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			arr[i][j]=sc.nextInt();
		}
	}

	for(int j=0;j<row;j++){
		//adding the numbers of a row
		for(int k=0;k<col;k++){
			row_sum1+=arr[j][k];
		}
		//comparing and finding the row that has the highest total
		if(row_sum2<row_sum1){
			row_sum2=row_sum1;
			count++;
		}
		else if(row_sum1==row_sum2){
			count_eq++;
		}
		row_sum1=0;
	}
	if(count_eq==row){
		System.out.println("Equal");
	}else{
		System.out.println("Row "+count);
	}
	}
}
