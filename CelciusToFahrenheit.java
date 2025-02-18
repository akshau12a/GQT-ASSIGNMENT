package com.gqt;

import java.util.Scanner;


public class CelciusToFahrenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Celcius = ");
		
		int celcius = scan.nextInt();
		
		double Fahrenheit =(celcius*9/5)+32;
		
		System.out.println(celcius+ " Celcius is equal to = "+Fahrenheit+" Fahrenheit");	
		scan.close();
	}
}