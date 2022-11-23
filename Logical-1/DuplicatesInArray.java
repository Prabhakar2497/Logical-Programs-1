package interview;

import java.util.Queue;
import java.util.TreeSet;
import java.util.Vector;

public class DuplicatesInArray {
public static void main(String[] args) {
	TreeSet<String> t=new TreeSet<>();
	 String arr1[]={"Rajesh","Pavan","Vinay","Ravi"};
	 String arr2[]={"Pavan","Vijay","Ravi"};
	 for(int i=0;i<arr1.length;i++){
		 t.add(arr1[i]);
	 }
	 for(int j=0;j<arr2.length;j++){
		 t.add(arr2[j]);
	 }
	 for(String arr:t){
	 System.out.print(arr+" ");
}
}
}
