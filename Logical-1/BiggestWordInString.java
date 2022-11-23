package interview;

import java.util.Scanner;

public class BiggestWordInString {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The String");
	 String s=sc.nextLine();
	 String arr[]=s.split(" ");
	 int max=arr[0].length();
	 String ans=arr[0];
	 for(String ele:arr){
		 if(ele.length()>max){
			 max=ele.length();
			 ans=ele;
		 }
	 }
	 System.out.println("Biggest Word In The String:"+ans);
}
}
