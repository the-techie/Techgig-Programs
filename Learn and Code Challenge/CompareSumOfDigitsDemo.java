/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CompareSumOfDigitsDemo {
   public static void main(String args[]) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int tmp_num1=num1;
	int tmp_num2=num2;
	int num1_total=0, r1;
	int num2_total=0, r2;
	//taking out the individual digits in the number1 and adding
	while(tmp_num1>0){
		r1=tmp_num1%10;
		num1_total+=r1;
		tmp_num1=tmp_num1/10;
	}
	//taking out the individual digits in the number2 and adding
	while(tmp_num2>0){
		r2=tmp_num2%10;
		num2_total+=r2;
		tmp_num2=tmp_num2/10;
	}
	//comparing both sums
	if(num1_total>num2_total){
		System.out.println(num1);
	}
	else if(num1_total<num2_total){
		System.out.println(num2);
	}
	else{
		System.out.println("Equal");
	}
}
}
