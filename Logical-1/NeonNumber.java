package interview;

import java.util.Scanner;

public class NeonNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	 int n=sc.nextInt();
	 int sq=n*n;
	 int rem,sum=0;
	 while(sq!=0){
		 rem=sq%10;
		 sum=sum+rem;
		 sq=sq/10;
	 }
	 if(n==sum){
		 System.out.println("Neon Number");
	 }
	 else{
		 System.out.println("Not a Neon Number");
	 }
}
}
