package week1.d2assignment;

import java.util.Arrays;

public class MissingElementsinArray {

	public static void main(String[] args) {
		 int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		System.out.println("Missing Elements in Array is :");
		
		for (int i = 1; i<=arr.length; i++) {
		       
			if(i!=arr[i-1])
			{
				System.out.println(i);
				break;
			}
		}
		
		
		

	}

}
