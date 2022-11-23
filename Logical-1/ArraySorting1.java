package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraySorting1 {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int arr[]={1,4,0,-12,0,-6,8};
	 ArrayList al=new ArrayList<>();
	 for(int i=0;i<arr.length;i++){
		 if(arr[i]<0){
			al.add(arr[i]); 
		 }
	 }
	 for(int i=0;i<arr.length;i++){
		 if(arr[i]==0){
			 al.add(arr[i]);
		 }
	 }
	 for(int i=0;i<arr.length;i++){
		 if(arr[i]>0){
			 al.add(arr[i]);
		 }
	 }
	 System.out.print(al+" ");
}
}
