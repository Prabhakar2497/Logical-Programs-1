package interview;

import java.util.Scanner;

public class MaxOfThreeNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The First Number");
	int n1=sc.nextInt();
	System.out.println("Enter The Second Number");
	int n2=sc.nextInt();
	System.out.println("Enter The Third Number");
	int n3=sc.nextInt();
	if(n1>n2&&n1>n3){
		System.out.println(n1+" is greater number");
	}
	else if(n2>n3&&n2>n1){
		System.out.println(n2+" is greater number");
	}
	else{
		System.out.println(n3+" is greater number");
	}
}
}
