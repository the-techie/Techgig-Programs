/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class DictionaryLexicalDemo {
  public static void main(String args[]) throws Exception {
  //Write code here
  Scanner sc=new Scanner(System.in);
  int len=sc.nextInt();
  String[] str=new String[len];
    for(int i=0;i<len;i++){
      str[i]=sc.next();
    }
  int k=0;
  String tmp;
  while(k<len){
    for(int j=0;j<len-1;j++){
      if(str[j].compareTo(str[j+1])>0){
        tmp=str[j];
        str[j]=str[j+1];
        str[j+1]=tmp;
      }
    }
    k++;
  }
  for(int i=0;i<len;i++){
    System.out.println(str[i]);
  }
  }
}
