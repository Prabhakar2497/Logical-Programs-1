package interview;

import java.util.Scanner;

public class Char1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Character");
	char c=sc.next().charAt(0);
	c++;
	System.out.println(c);
}
}
