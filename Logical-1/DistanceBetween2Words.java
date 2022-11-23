package interview;

import java.util.Scanner;

public class DistanceBetween2Words {
	public static int distance(String s,String w1,String w2){
		if(w1.equals(w2)){
			return 0;
		}
		String words[]=s.split(" ");
		int minDistance=words.length;
		for(int i=0;i<words.length;i++){
			if(words[i].equals(w1)){

				for(int j=0;j<words.length;j++){
					if(words[j].equals(w2)){
						int current=Math.abs(i-j)-1;
						if(current<minDistance){
							minDistance=current;
						}
					}
				}
			}
		}
		return minDistance;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Sentence");
		String s=sc.nextLine();
		System.out.println("Enter The First Word");
		String w1=sc.next();
		System.out.println("Enter The Second String");
		String w2=sc.next();
		System.out.println("Max Distance Between 2 Words:");
		System.out.println(distance(s, w1, w2));
	}
}
