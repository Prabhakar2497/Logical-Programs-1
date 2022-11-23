package interview;

import java.util.Scanner;

public class OccuranceOfWords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String");
	String s1=sc.nextLine();
	String arr1[]=s1.split(" ");
	String arr2[]=s1.split(" ");
	for(int i=0;i<arr1.length;i++){
		String s=arr1[i];
		int count=0;
		for(int j=0;j<arr2.length;j++){
			if(s.equals(arr2[j])){
				count++;
				arr2[j]="\0";
			}
		}
		if(count>0){
			System.out.println(s+":"+count);
		}
	}
}
}
