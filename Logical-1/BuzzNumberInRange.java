package interview;

import java.util.Scanner;

public class BuzzNumberInRange {
	 
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The First Number");
	 int n1=sc.nextInt();
	 System.out.println("Enter The Second Number");
	 int n2=sc.nextInt();
	 for(int i=n1;i<=n2;i++){
		  buzzNumber(i);
	 }
}
	 public static void buzzNumber(int n){
		 
	 if(n%10==7||n%7==0){
		 System.out.println(n+" is Buzz Number");
	 }
	 else{
		 System.out.println(n+" is Not a Buzz Number");
	 }
	
}
}
