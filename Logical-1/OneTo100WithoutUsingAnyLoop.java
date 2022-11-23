package interview;

public class OneTo100WithoutUsingAnyLoop {
	 public static void numbers(int n){
		 if(n<=100){
			 System.out.println(n);
			 numbers(n+1);
		 }
	 }
    public static void main(String[] args){
 int n=1;
 numbers(n);
    }
}
