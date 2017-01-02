/* Read input from STDIN. Print your output to STDOUT*/
//Recursive Method
import java.io.*;
import java.util.*;
public class GCDRecursionDemo {
	public int gcd(int a, int b){
		if(b==0){
			return a;
		}
		return gcd(b,a%b);
		//you can write this in one line
		/*
			return b==0 ? a : gcd(b,a%b);
		*/
	}
	public static void main(String args[]) throws Exception {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		GDCRecursionDemo obj=new GDCRecursionDemo();
		System.out.println(obj.gcd(n1,n2));
	}
}
