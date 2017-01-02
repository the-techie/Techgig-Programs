/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class PowerRecursionDemo {
  public static void main(String args[] ) throws Exception {
  //Write code here
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int n=sc.nextInt();
  int power=x;
  while(n>1){
    power*=x;
    n--;
  }
  System.out.println(power);
  }
}
