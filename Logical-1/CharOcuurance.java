package interview;

import java.util.ArrayList;
import java.util.Scanner;

public class CharOcuurance {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String s="prabhakar";
	 char arr[]=s.toCharArray();
	 for(int i=0;i<arr.length;i++){
		 char c=s.charAt(i);
		 int count=0;
		 for(int j=0;j<arr.length;j++){
			 if(c==arr[j]){
				 count++;
				 arr[j]='\0';
			 }
		 }
		 if(count>0){
			 System.out.println(c+":"+count);
		 }
	 }
	}
}

