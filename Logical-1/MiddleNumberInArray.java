package interview;

import java.util.LinkedList;
import java.util.Scanner;

public class MiddleNumberInArray {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The Array Size:");
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 System.out.println("Enter The Array Elements:");
	 for(int i=0;i<arr.length;i++){
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("Array Elements Are:");
	 for(int i=0;i<arr.length;i++){
		 System.out.print(arr[i]+" ");
	 }
	 System.out.print("Middle Elements is:");
		for(int i=0;i<arr.length;i++){
			if(arr.length%2==0){
	 System.out.println(arr[(arr.length/2)-1]+" and "+arr[arr.length/2]);
			}
			else{
				System.out.println(arr[arr.length/2]);
			}
		}
}
}
