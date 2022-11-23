package interview;

import java.util.Scanner;

public class ArrayNumbersToWords {
public static void main(String[] args) {
	String arr[]={"zero","one","two","three","four","five","six","seven",
			"eight","nine","ten"};
	int rem=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	String ans="";
	while(n!=0){
		rem=n%10;
		ans=arr[rem]+ans;
		n=n/10;
	}
	System.out.print(ans);
}
}
