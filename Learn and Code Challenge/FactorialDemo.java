/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class FactorialDemo {
    public static void main(String args[]) throws Exception {
    //Write code here
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int i=(number-1);
	while(i>0){
	    number*=i;
	    i--;
	}
    System.out.println(number);
}
}
