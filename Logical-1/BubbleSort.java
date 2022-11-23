package interview;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int arr[]={12,3,45,67,23,5,16};
	 for(int i=0;i<arr.length;i++){
		 for(int j=i+1;j<arr.length;j++){
			 if(arr[i]>arr[j]){
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		 }
		 System.out.print(arr[i]+" ");
	 }
	 System.out.print("Smallest Element:");
	 System.out.println(arr[0]+" ");
	 System.out.println("Largest Element:");
	 System.out.println(arr[(arr.length)-1]);
}
}
