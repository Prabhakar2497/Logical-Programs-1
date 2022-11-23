package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayMinSubMul {
	public static int[] actualTask(int[] input1) {
		List givenArray = new ArrayList();
		for(int value:input1)
			givenArray.add(value);
		
		int minimumValue = (int) Collections.min(givenArray);
		
		for(int i = 0; i < input1.length; i++) {
			input1[i] = input1[i] - minimumValue;
			input1[i] = input1[i] * minimumValue;
		}
		
		return input1;
	}

	public static void main(String[] args) {

		int actualArray[] = { 5, 2, 7, 9, 8, 4, 1, 3 };
				
		
		int[] resultArray = ArrayMinSubMul.actualTask(actualArray);
		
		System.out.println("Final result:");
		for(int element:resultArray)
			System.out.print(element + " " );
	}
}
