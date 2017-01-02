/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class GetClassDemo {
   public static void main(String args[]) throws Exception {
	//Write code here
    Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt()){
			System.out.println("This input is of type Integer.");		
		}
		else if(sc.hasNextFloat()){
			System.out.println("This input is of type Float.");
		}
		else if(sc.hasNextLine()){
			System.out.println("This input is of type string.");
		}
		else{
		    System.out.println("This is something else.");
		}
	}
}
