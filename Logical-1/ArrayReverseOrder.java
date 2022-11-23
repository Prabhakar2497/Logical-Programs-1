package interview;

public class ArrayReverseOrder {
public static void main(String[] args) {
	int arr1[]={1,2,3,4,5,6,7};
	 int arr2[]=new int[arr1.length];
	 for(int i=0,j=arr1.length-1;i<arr1.length;i++,j--){
		 arr2[i]=arr1[j];
	 }
	 for(int i:arr2){
		 System.out.print(i+" ");
	 }
}
}
