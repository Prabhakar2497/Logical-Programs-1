package interview;

import java.util.Scanner;

public class MatrixMultiplication {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The Array Size");
	 int size=sc.nextInt();
	 int arr[][]=new int[size][size];
	 System.out.println("Enter The Array Elements");
	 for(int i=0;i<arr.length;i++){
		 for(int j=0;j<arr.length;j++){
			 arr[i][j]=sc.nextInt();
		 }
	 }
	 System.out.println("Array Elements Are:");
	 for(int i=0;i<arr.length;i++){
		 for(int j=0;j<arr.length;j++){
			 System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
	 System.out.println("Matrix Multiplication:");
	 for(int i=0;i<arr.length;i++){
		 for(int j=0;j<arr.length;j++){
		 System.out.print(arr[i][j]*arr[i][j]+" ");
		 }
		 System.out.println();
		 }
	 System.out.println("Diagonal Matrix Multiplication:");
	 for(int i=0;i<arr.length;i++){
		 for(int j=0;j<arr.length;j++){
		 if(i==j){
			 System.out.print(arr[i][j]*arr[i][j]+" ");
		 }
		 else{
			 System.out.print(" "+" ");
		 }
		 }
		 System.out.println();
		 }
}
}
