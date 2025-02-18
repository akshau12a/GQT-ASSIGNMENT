package com.gqt;

public class LowercaseAlphabets{
    public static void main(String[] args) {
        // Using for loop
        System.out.println("Using for loop:");
        for (char ch = 'o'; ch >= 'c'; ch--) {
            System.out.println("Character: " + ch + ", ASCII Value: " + (int) ch);
        }

        // Using while loop
        System.out.println("\nUsing while loop:");
        char ch = 'o';
        while (ch >= 'c') {
            System.out.println("Character: " + ch + ", ASCII Value: " + (int) ch);
            ch--;
        }
    }
}
