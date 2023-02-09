package week1.d2assignment;

public class Fibonacci {

	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 1;
		int sum;
		int count = 8;
		
		System.out.println(firstNumber +" " +secondNumber);
	 
		 for(int i=2;i<=count;i++)
		 {
			sum = firstNumber+secondNumber; 
			firstNumber = secondNumber;
			secondNumber = sum;
			System.out.println(sum);
		 }

	}

}
