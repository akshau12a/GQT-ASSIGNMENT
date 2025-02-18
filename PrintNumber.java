package com.gqt;
public class PrintNumber {
    public static void main(String[] args) {

        System.out.println("Using for loop:");
        for (int i = 99; i >= 57; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        System.out.println("Using while loop:");
        int j = 99;
        while (j >= 57) {
            System.out.print(j + " ");
            j--;
        }
    }
}
