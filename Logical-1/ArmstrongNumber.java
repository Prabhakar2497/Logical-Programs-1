package interview;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
int n1=sc.nextInt();
int n2=n1;
int n3=n1;
int c=0;
while(n1!=0){
	n1=n1/10;
	c++;
}
int e=c;
int rem=0;
int sum=0;
while(n2!=0){
	rem=n2%10;
	int ans=1;
	for(int i=1;i<=e;i++){
		ans=ans*rem;
	}
	sum=sum+ans;
	n2=n2/10;
}
if(sum==n3){
	System.out.println("Armstrong Number");
}
else{
	System.out.println("Not an Armstrong Number");
}
}

}
