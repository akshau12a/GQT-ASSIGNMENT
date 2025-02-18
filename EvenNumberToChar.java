package com.gqt;

public class EvenNumberToChar {
    public static void main(String[] args) {
        System.out.println("Using FOR loop:");
        // For loop to iterate from 121 to 60
        for (int i = 121; i >= 60; i--) {
            if (i % 2 == 0) { // Check if the number is even
                System.out.println("Number: " + i + " -> Character: " + (char) i);
            }
        }

        System.out.println("\nUsing WHILE loop:");
        // While loop to iterate from 121 to 60
        int j = 121;
        while (j >= 60) {
            if (j % 2 == 0) { // Check if the number is even
                System.out.println("Number: " + j + " -> Character: " + (char) j);
            }
            j--;
        }
    }
}