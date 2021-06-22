package javaBootcamp;

public class javaExamplePrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=17;
		
		if(number<2){
			System.out.println("Please write a number greater than one...");
		}else if(number%2 == 0) {
			if(number == 2) {
				System.out.println("This is a prime number...");	
			}else { 
			System.out.println("This is NOT a prime number...");
			}
		}else {
			if((number == 3) || (number == 5)|| (number == 7)) {
				System.out.println("This is a prime number...");
				
			}else if((number%3 == 0) || (number%5 == 0) || (number%7 == 0)) {
				System.out.println("This is NOT a prime number...");
				
			}else {
				System.out.println("This is a prime number...");
			}
		
			
		}
		
		
	}

}
