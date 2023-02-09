package week1.d2assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		int a = 13;
		
		boolean isPrime = false;
		//13/2,3,4,5,6,7,8,9,10,11,12,13
		   // 6,4,3,2,2,1,1,1
	 for (int i = 2; i <=a/2; i++) {
			
	 if(a%i==0)
	 {
		 isPrime = true;
		 break;
	 }
	   
	 }
	   if(! isPrime) {
		   System.out.println("The number "+a+" is a prime Number" );
	   } else
		   System.out.println("The number is not a prime ");
	}
}
	 
	 
		
		
	


