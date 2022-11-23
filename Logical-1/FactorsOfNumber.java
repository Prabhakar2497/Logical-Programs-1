package interview;

import java.util.Scanner;

public class FactorsOfNumber {
public static void main(String[] args) {
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
		if(n%i==0){
			System.out.println(i);
			count++;
		}
	}
	System.out.println("----------");
	System.out.println("Number of Factors:"+count);
}
}
