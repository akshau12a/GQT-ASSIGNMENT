package com.gqt;

import java.util.Scanner;

public class ConvertYenToInr {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Amount in Yen = ");
		
		int yen = scan.nextInt();
		
		double inr = yen * 0.56;
		
		String formattedValue = String.format("%.2f",inr);
		
		System.out.print(yen + "¥ is = " + "" +"₹"+ formattedValue);						
	}
}