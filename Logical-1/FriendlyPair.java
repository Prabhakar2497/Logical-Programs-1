package interview;

import java.util.Scanner;

public class FriendlyPair {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The First Number");
	int n1=sc.nextInt();
	System.out.println("Enter The Second Number");
	int n2=sc.nextInt();
	int sum1=0;
	int sum2=0;
	for(int i=1;i<n1;i++){
		if(n1%i==0){
			sum1=sum1+i;
		}
	}
	for(int i=1;i<n2;i++){
		if(n2%i==0){
			sum2=sum2+i;
		}
	}
	if(sum1/n1==sum2/n2){
		System.out.println("Friendly Pair");
	}
	else{
		System.out.println("Not a Friendly Pair");
	}
}
}
