package interview;

import java.util.Scanner;

public class ArrayKeyIndex {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int arr[]={1,3,45,23,87,12};
	 int key=46;
	 int flag=0;
	 for(int i=0;i<arr.length;i++){
		 if(arr[i]==key){
			 System.out.println("Key:"+key+" Index Position:"+i);
			flag=1;
			break;
		 }
	 }
	 if(flag==0){
		 System.out.println("Key Not Found");
	 }
}
}
