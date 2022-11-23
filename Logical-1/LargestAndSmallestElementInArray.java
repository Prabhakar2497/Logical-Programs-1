package interview;

import java.util.Scanner;

public class LargestAndSmallestElementInArray {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The Array Size");
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 System.out.println("Enter The Array Elements");
	 for(int i=0;i<size;i++){
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("Array Elements Are:");
	 for(int i=0;i<arr.length;i++){
		 System.out.println(arr[i]+" ");
	 }
	 int max=arr[0];
	 for(int i=0;i<size;i++){
		 if(arr[i]>max){
			 max=arr[i];
		 }
	 }
	 System.out.println("Max:"+max);
	 int min=arr[0];
	 for(int i=0;i<arr.length;i++){
		 if(arr[i]<min){
			 min=arr[i];
		 }
	 }
	 System.out.println("Min:"+min);
	 System.out.println("Difference:"+(max-min));
}
}
