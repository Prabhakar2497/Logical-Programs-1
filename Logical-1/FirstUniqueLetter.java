package interview;

public class FirstUniqueLetter {
public static void main(String[] args) {
	int _=23;
	System.out.println(_);
	String s="bbangalore";
	char a='0';
	for(int i=0;i<s.length();i++){
		int count=0;
		for(int j=0;j<s.length();j++){
			if(i!=j&&s.charAt(i)==s.charAt(j)){
				count++;
			}
		}
		if(count==0){
			a=s.charAt(i);
			break;
		}
	}
	System.out.println(a);
}
}
