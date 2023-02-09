package week1.d2assignment;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
	   
		int a = 34343;
		int b = a;
		int temp = 0;
		
		for (int i=0; i<=4; i++) {
			
		temp = (temp*10) + (a%10);
			 a = a/10;
			 
			
		}
		
		System.out.println(temp);
		
	if(b == temp)
		
	{
		
	  System.out.println("It is a palindrome"); 

	}
	else {
		System.out.println("It is not a palindrome");
	}
		
	}
}


