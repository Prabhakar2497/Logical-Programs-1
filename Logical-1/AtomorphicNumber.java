package interview;

import java.util.Scanner;

public class AtomorphicNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	 int n=sc.nextInt();
	 int sq=n*n;
	 while(n!=0){
		 if(n%10!=sq%10){
			 System.out.println("Not a Atomorphic Number");
		 }
		 n=n/10;
		 sq=sq/10;
	 }
	 System.out.println("Atomophic Number");
}
}
