package interview;

import java.util.Scanner;

public class FirstHalfOfTheString {
	public static  String firstHalf(String str){
		int len=str.length();
		return str.substring(0,len/2);
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String");
	String s=sc.next();
	System.out.println(FirstHalfOfTheString.firstHalf(s));
}
}
