package interview;

public class MiddleThreeElements {
	private static int[] myArray;
	public static int[] midThree(int[]nums){
		int myArray[]=new int[3];
		int middle=nums.length/2;
		myArray[0]=nums[middle-1];
		myArray[1]=nums[middle];
		myArray[2]=nums[middle+1];
		return myArray;
	}
public static void main(String[] args) {
	int midThree[]={1,2,3,4,5,6,7};
	System.out.println(MiddleThreeElements.midThree(myArray));
}
}
