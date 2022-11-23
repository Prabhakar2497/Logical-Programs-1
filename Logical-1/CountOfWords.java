package interview;

import java.util.Scanner;

public class CountOfWords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String");
	String s=sc.nextLine();
	String words[]=s.split(" ");
	int dist=words.length;
	System.out.println(dist);
}
}
