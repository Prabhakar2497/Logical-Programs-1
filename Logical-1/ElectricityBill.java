package interview;

import java.util.Scanner;

public class ElectricityBill {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number Of Units");
	long units=sc.nextLong();
	double billPay=0;
	if(units<100){
		billPay=units*1.20;
	}
	else if(units<300){
		billPay=100*1.20+(units-100)*2;
	}
	else if(units>300){
		billPay=100*1.20+200*2+(units-300)*3;
	}
	System.out.println("Bill To Pay:"+billPay);
}
}
