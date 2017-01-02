/* Read input from STDIN. Print your output to STDOUT*/
//Euclidean Method
import java.io.*;
import java.util.*;
public class GCDEuclideanDemo {
   public static void main(String args[]) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int rem;
	if(n1==0){
		System.out.println(n2);
	}
	while(n2!=0){
		if(n1>n2){
			n1=n1-n2;
		}
		else{
			n2=n2-n1;
		}
	}
		System.out.println(n1);
	}
}
