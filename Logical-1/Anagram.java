package interview;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The First String");
	 String s1=sc.next();
	 System.out.println("Enter The Second String");
	 String s2=sc.next();
	 if(s1.length()==s2.length()){
		 char arr1[]=s1.toCharArray();
		 char arr2[]=s2.toCharArray();
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 boolean result=Arrays.equals(arr1, arr2);
		 if(result){
			 System.out.println(s1+" and "+s2+" anagram");
		 }
		 else{
			 System.out.println(s1+" and "+s2+" not an anagram");
		 }
	 }
	 else{
		 System.out.println(s1+" and "+s2+" not an anagram");
	 }
}
}
