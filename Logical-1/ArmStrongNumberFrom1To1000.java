package interview;


public class ArmStrongNumberFrom1To1000 {
	public static void main(String[] args) {
	int n;
	int sum=0;
	int rem=0;
	for(int i=1;i<=1000;i++){
		n=i;
		while(n!=0){
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(sum==i){
			System.out.println(i+" ");
		}
		sum=0;
	}
	}
}