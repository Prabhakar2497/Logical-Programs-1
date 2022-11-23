package interview;

public class FibonacciSeriesInRange {
public static void main(String[] args) {
	int n1=0;
	int n2=1;
	int sum=0;
	int ln=150;
	int hn=500;
	while(true){
		if(n1>ln){
			System.out.println(n1);
		}
		sum=n1+n2;
		n1=n2;
		n2=sum;
		if(n1>=hn){
			break;
		}
	}
}
}
