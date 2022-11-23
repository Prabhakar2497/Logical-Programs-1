package interview;

import java.util.Scanner;

public class ArraySort {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	  int arr[]={13,12,14,6,7,9,15,18,2};
	  for(int i=0;i<arr.length;i=i+2){
		  for(int j=i;j<arr.length;j=j+2){
			 if(arr[j]>arr[i]){
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		  }
	  }
	  for(int i=1;i<arr.length;i=i+2){
		  for(int j=i;j<arr.length;j=j+2){
			 if(arr[j]<arr[i]){
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		  }
	  }
	  for(int i=0;i<arr.length;i++){
		  System.out.print(arr[i]+" ");
	  }
}
}
