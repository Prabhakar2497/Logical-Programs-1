package interview;

public class OccuranceOfEachCharacter {
	public static String countOfCharacter(String s){
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++){
			char c=s.charAt(i);
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(c==arr[j]){
					count++;
					arr[j]='\0';
				}
			}
			if(count>0){
				System.out.println(c+":"+count);
			}
		}
		return s;
	}
public static void main(String[] args) {
	String s="prabhakar";
	System.out.println(countOfCharacter(s));
}
}
