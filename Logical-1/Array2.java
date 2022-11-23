package interview;

import java.util.Scanner;

public class Array2 {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	System.out.println("enter a size of array");
	int size=ip.nextInt();
	int[] arr=new int[size];
	System.out.println("enter a values for a array");
	for(int j=0;j<=size-1;j++) {
		arr[j]=ip.nextInt();
	}
	System.out.println("Array Elements Are");
	for(int i=0;i<= arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
