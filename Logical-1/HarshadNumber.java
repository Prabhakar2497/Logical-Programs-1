package interview;

import java.util.Scanner;

public class HarshadNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	 int n1=sc.nextInt();
	 int n2=n1;
	 int rem,sum=0;
	 while(n1!=0){
		 rem=n1%10;
		 sum=sum+rem;
		 n1=n1/10;
	 }
	 if(n2%sum==0){
		 System.out.println("Harshad Number");
	 }
	 else{
		 System.out.println("Not a Harshad Number");
	 }
}
}
