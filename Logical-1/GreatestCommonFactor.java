package interview;

public class GreatestCommonFactor {
public static void main(String[] args) {
	int a=18;
	int b=12;
	int ans=1;
	for(int i=1;i<=a &&i<=b;i++){
		if(a%i==0&&b%i==0){
			ans=i;
		}
	}
System.out.println("Greatest Common Factors of "+ a+" and "+ b+" is " +ans);
System.out.printf("GCD of %d and %d is: %d", a, b, ans);  
}
}
