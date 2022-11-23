package interview;

import java.util.Scanner;

public class ArrayIdentical {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	  int arr1[]={1,2,3,4,5};
	  int arr2[]={1,3,3,4,5};
	  if(arr1.length==arr2.length){
		  int flag=0;
		  for(int i=0;i<arr1.length;i++){
			  if(arr1[i]!=arr2[i]){
				  flag=1;
				  break;
			  }
		  }
		  if(flag==0){
			  System.out.println("Identical Array");
		  }
		  else{
			  System.out.println("Not an Identical Array");
		  }
	  }
	 
	 
}
}
