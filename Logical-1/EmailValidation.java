package interview;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The Email");
	 String email=sc.next();
	 Pattern p=Pattern.compile("[a-z,A-Z]{5,30}[0-9]{0,20}@gmail.com");
	 Matcher m=p.matcher(email);
	 boolean ans=m.matches();
	 System.out.println(ans);
}
}
