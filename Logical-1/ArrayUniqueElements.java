package interview;

import java.util.Scanner;

public class ArrayUniqueElements {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	  int arr[]={1,2,3,4,5,2,3};
	  for(int i=0;i<arr.length;i++){
		  int flag=0;
		  for(int j=0;j<arr.length;j++){
			  if(i!=j&&arr[i]==arr[j]){
				 flag=1;
				 break;
			  }
		  }
		  if(flag==0){
			  System.out.print(arr[i]+" ");
		  }
	  }
}
}
