package interview;

import java.util.Scanner;

public class MakeOutWord {
	 public String makeOutWord(String s1,String s2,String s3){
		 return s1 + s2 +s3;
	 }
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The First Half");
	String s1=sc.next();
	System.out.println("Enter The Word");
	String s2=sc.next();
	System.out.println("Enter The Second");
	String s3=sc.next();
	System.out.println(s1 + s2 + s3);
}
}
