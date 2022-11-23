package interview;

import java.util.Scanner;

public class EmripNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int count=0;
	int rem=0;
	int rev=0;
	int temp=rev;
	for(int i=1;i<=n;i++){
		if(n%i==0){
			count++;
	
	while(n!=0){
		rem=n%10;
		rev=(rev*10)+rem;
		n=n/10;
	}
		}
	}
	if(temp==rev)
	if(count==2){
		System.out.println("Prime Number");
	}
	else{
		System.out.println("not");
	}
}
}
