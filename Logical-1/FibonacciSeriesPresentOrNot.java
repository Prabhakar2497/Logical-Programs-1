package interview;

import java.util.Scanner;

public class FibonacciSeriesPresentOrNot {
	 public static int fibonacci(int n){
		 if(n==0){
			 return 0;
		 }
			 else if(n==1||n==2){
				 return 1;
		 }
		 return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int number=sc.nextInt();
		 int i=1;
		 while(i>0){
			 int fibNumber=fibonacci(i);
			 if(fibNumber!=number){
				 if(fibNumber>number){
					 System.out.println("Number is not in Fibonacci Series");
				 break;
				 }
				 else{
					 i++;
			 }
			 }
				 else{
					 System.out.println("Number is present in Fibonacci Series");
		break;
				 
			 }
		 }
	}
}
