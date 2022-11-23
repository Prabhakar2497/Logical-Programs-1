package interview;

import java.util.Scanner;

public class HappyNumber {
	 public static int happyNumber(int n){
		 int rem=0;
		 int sum=0;
		 while(n!=0){
			 rem=n%10;
			 sum=sum+(rem*rem);
			 n=n/10;
		 }
		 return sum;
	 }
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		while(n!=1&&n!=4){
			n=happyNumber(n);
		}
		if(n==1){
			System.out.println("Happy Number");
		}
		else{
			System.out.println("Not a Happy Number");
		}
	}
}
