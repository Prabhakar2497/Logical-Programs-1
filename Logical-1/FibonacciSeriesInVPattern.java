package interview;

public class FibonacciSeriesInVPattern {
public static void main(String[] args) {
	int n=5;
	int n1=0,n2=1,sum=0;
  for(int i=1;i<=n;i++) {
	  for(int j=1;j<=(n*2)-1;j++) {
		  if(i==j||i+j==n*2 ) {
			  sum=n1+n2;
			  System.out.print(n1+" ");
			  n1=n2;
			  n2=sum;
		  }
		  else {
			  System.out.print("  ");
		  }
	  }
	  System.out.println();
  }
}
}
