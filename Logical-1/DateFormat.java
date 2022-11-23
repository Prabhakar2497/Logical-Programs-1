package interview;

import java.time.LocalDate;
import java.util.Date;

public class DateFormat {
public static void main(String[] args) {
	Date d=new Date();
	System.out.println(d);
	LocalDate today=LocalDate.now();
	LocalDate yesterday=today.minusDays(1);
	LocalDate tommarow=today.plusDays(1);
	System.out.println(today);
	System.out.println(yesterday);
	System.out.println(tommarow);
}
}
