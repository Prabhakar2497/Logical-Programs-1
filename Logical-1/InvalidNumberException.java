package interview;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InvalidNumberException extends RuntimeException{
	private String message;
	public InvalidNumberException(String message) {
		this.message=message;
	}
	public String getMessage(){
		return message;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The 10 Digit Phone Number");
	String number=sc.next();
	Pattern p=Pattern.compile("[0-9]{10}");
	Matcher m=p.matcher(number);
	boolean ans=m.matches();
	if(number.length()==10){
		if(number.startsWith("9")||number.startsWith("8")||
		number.startsWith("7")||number.startsWith("6")){
			System.out.println("Valid Number");
		}
		else if(number.startsWith("")){
			System.out.println("Enter The Number Starts With 9 or 8 or 7 or 6");
		}
		else{
			try{
			throw new InvalidNumberException("Inavalid Number");
		}
			catch(InvalidNumberException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
}
