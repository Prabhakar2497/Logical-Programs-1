package interview;

import java.util.Scanner;

public class MultipleArraySum {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The Array Size");
	 int size=sc.nextInt();
	 System.out.println("Enter The First Array Elements");
	 int arr1[][]=new int[size][size];
	 for(int i=0;i<arr1.length;i++){
		 for(int j=0;j<arr1.length;j++){
		 arr1[i][j]=sc.nextInt();
	 }
	 }
	  System.out.println("Enter The Second Array Elements");
	  int arr2[][]=new int[size][size];
	  for(int i=0;i<arr2.length;i++){
	  for(int j=0;j<arr2.length;j++){
		  arr2[i][j]=sc.nextInt();
	  }
	  }
	  System.out.println("First Array Elements Are:");
	  for(int i=0;i<arr1.length;i++){
		  for(int j=0;j<arr1.length;j++){
		  System.out.print(arr1[i][j]+" ");
	  }
		  System.out.println();
	  }
	  System.out.println("Second Array Elements Are:");
	  for(int i=0;i<arr2.length;i++){
	  for(int j=0;j<arr2.length;j++){
		  System.out.print(arr2[i][j]+" ");
	  }
	  System.out.println();
	  }
	  System.out.println("Miltiple Array Sum:");
	  int arr3[][]=new int[size][size];
	  for(int i=0;i<arr1.length;i++){
		  for(int j=0;j<arr2.length;j++){
			  arr3[i][j]=arr1[i][j]+arr2[i][j];
			  System.out.print(arr3[i][j]+" ");
		  }
		 System.out.println();
	  }
	  System.out.println("Diagonal Elements Multiplication");
	  for(int i=0;i<arr1.length;i++){
		  for(int j=0;j<arr2.length;j++){
			   if(i==j){
				   System.out.print(arr1[i][j]*arr2[i][j]+" ");
			   }
			   else{
				   System.out.print(" "+" ");
			   }
		  }
		  System.out.println();
	  }
}
}
