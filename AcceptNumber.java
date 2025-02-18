package com.gqt;
public class AcceptNumber {
    public static void main(String[] args) {

        if (args.length < 8) {
            System.out.println("Please provide 8 numbers as command-line arguments.");
            return;
        }

  
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        int f = Integer.parseInt(args[5]);
        int g = Integer.parseInt(args[6]);
        int h = Integer.parseInt(args[7]);

        System.out.println("Sum of first two numbers: " + (a + b));
        System.out.println("Difference of next two numbers: " + (c - d));
        System.out.println("Product of next two numbers: " + (e * f));

        if (h != 0) {
            System.out.println("Quotient of last two numbers: " + ((double) g / h));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
