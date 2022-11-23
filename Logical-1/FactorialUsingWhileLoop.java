package interview;

public class FactorialUsingWhileLoop {
public static void main(String[] args) {
	int n1=6;
	int n2=1;
	int fact=1;
	while(n2<=n1){
		fact=fact*n2;
		n2++;
	}
	System.out.println(fact);
}
}
