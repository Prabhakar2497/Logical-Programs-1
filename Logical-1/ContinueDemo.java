package interview;

public class ContinueDemo {
public static void main(String[] args) {
	for(int i=1;i<=10;i++){
		if(i==5||i==7){
			continue;
		}
		else if(i==3||i==8){
			continue;
		}
		System.out.println(i);
	}
}
}