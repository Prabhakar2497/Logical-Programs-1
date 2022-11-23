package interview;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfWords {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The String");
	 String s1=sc.nextLine();
	 ArrayList al=new ArrayList<>();
	 String s2="";
	 for(int i=0;i<s1.length();i++){
		 char c=s1.charAt(i);
		 if(c==' '){
			 al.add(s2);
			 s2=s2+c;
		 }
		 else{
			 s2=s2+c;
		 }
	 }
		 al.add(s2);
		 System.out.println("Number Of Words:"+al.size());
	 
	 
}
}
