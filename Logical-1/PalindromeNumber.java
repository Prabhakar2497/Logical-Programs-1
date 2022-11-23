package interview;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n1=sc.nextInt();
	int n2=n1;
	int rem,rev=0;
	while(n1!=0){
		rem=n1%10;
		rev=(rev*10)+rem;
		n1=n1/10;
	}
	if(n2==rev){
		System.out.println("Palindrome Number");
	}
	else{
		System.out.println("Not a Palindrome Number");
	}
}
}
