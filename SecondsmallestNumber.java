package week1.d2assignment;

import java.util.Arrays;

public class SecondsmallestNumber {

	public static void main(String[] args) {
		
		int[] arr = {23,45,67,32,89,22};
	   
		Arrays.sort(arr);
		
		System.out.println("The Second Smallest number in array :" +arr[1]);

	}

}
