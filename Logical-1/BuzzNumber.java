package interview;

import java.util.Scanner;

public class BuzzNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	for(int i=1;i<=100;i++)
		if(n%10==7||n%7==0){
			System.out.println("Buzz Number");
		}
		else{
			System.out.println("Not a Buzz Number");
		}
}
}
