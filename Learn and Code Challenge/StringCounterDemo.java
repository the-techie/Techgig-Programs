/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class StringCounterDemo {
public static void main(String args[]) throws Exception {
    //Write code here
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int len=str.length();	
    int low=0;
    int up=0;
    char chr[]=new char[len];
    //moving the string to a character array
    chr=str.toCharArray();
    for(int i=0; i<len; i++){
        if(Character.isUpperCase(chr[i])){
            up++;
        }
        else if(Character.isLowerCase(chr[i])){
            low++;
        }
    }
    System.out.println(up+"\n"+low);
    }
}
