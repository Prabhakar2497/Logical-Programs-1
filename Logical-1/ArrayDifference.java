package interview;

import java.util.Scanner;

public class ArrayDifference {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	  int arr[]={12,3,4,5,6,87,34};
	   int max=arr[0];
	   for(int i=0;i<arr.length;i++){
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
