package interview;

import java.util.Scanner;

public class EvenOrOddWithoutUsingModules {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int a=n/2;
	if(a*2==n){
		System.out.println("Even Number");
	}
	else{
		System.out.println("Odd Number");
	}
}
}
