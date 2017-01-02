/* Read input from STDIN. Print your output to STDOUT*/
//Division Method
import java.io.*;
import java.util.*;
public class GCDDemo2 {
   public static void main(String args[]) throws Exception {
	//Write code here
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int rem;
	//you can also use n2 as an iterative value
	while(n1!=0){
		rem=n2%n1;
		n2=n1;
		n1=rem;
	}
	System.out.println(n2);
	}
}
