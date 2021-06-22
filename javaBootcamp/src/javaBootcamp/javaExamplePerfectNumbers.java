package javaBootcamp;

import java.util.ArrayList;

import java.util.List;

public class javaExamplePerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=28;
		int total=0;
		
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				total += i;
			}
		}
		
		

		
		System.out.println("total: " + total);
		System.out.println("number: " + number);
		
		if(total == number) {
			System.out.println("The numer is a perfect number");	
		}else {
			System.out.println("The numer is NOT a perfect number");
		}
		
		

	}

}
