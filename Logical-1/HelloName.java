package interview;

import java.util.Scanner;

public class HelloName {
	public static String helloName(String name){
		return "Hello " + name +"!";
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Name");
	String s=sc.next();
	System.out.println(HelloName.helloName(s));
}
}
