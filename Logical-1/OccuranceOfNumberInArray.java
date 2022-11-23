package interview;

import java.util.Scanner;

public class OccuranceOfNumberInArray {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The Array Size");
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 System.out.println("Enter The Array Elements:");
	 for(int i=0;i<arr.length;i++){
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("Array Elements Are:");
	 for(int i=0;i<arr.length;i++){
		 System.out.println(arr[i]+" ");
	 }
	 
	 System.out.println("Enter The Element To Check Occurance");
	 int element=sc.nextInt();
	 int count=0;
	 for(int i=0;i<arr.length;i++){
		 if(arr[i]==element){
			 count++;
		 }
	 }
	 System.out.println("Occurance Of Element:");
	 System.out.println(count);
}
}
