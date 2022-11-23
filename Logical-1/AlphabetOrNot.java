package interview;

import java.util.Scanner;

public class AlphabetOrNot {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The Character");
	  char c=sc.next().charAt(0);
	  if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
		  System.out.println("Alphabetic Character");
	  }
	  else if(c>='0'&&c<='9'){
		  System.out.println("Numeric Character");
	  }
	  else{
		  System.out.println("Special Character");
	  }
}
}
