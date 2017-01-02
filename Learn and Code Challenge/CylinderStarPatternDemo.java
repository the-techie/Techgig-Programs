/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CylinderStarPatternDemo {
   public static void main(String args[] ) throws Exception {
	//Write code here
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			System.out.print("*");
			if(j!=4){
				System.out.print(" ");
			}
		}
		if(i!=4){
			System.out.print("\n");
		}
	}
	}
}
