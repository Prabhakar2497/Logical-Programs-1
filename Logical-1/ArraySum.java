package interview;

import java.util.Scanner;

public class ArraySum {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The Number Of Elements");
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 System.out.println("Enter The Elements");
	 for(int i=0;i<arr.length;i++){
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("Array Elements Are");
	 int sum=0;
	 for(int i=0;i<arr.length;i++){
		 System.out.println(arr[i]);
		 if(arr[i]%2==0)
		 sum=sum+arr[i];
	 }
	 System.out.println("Sum Of Elements");
	 System.out.println(sum);
}
}
