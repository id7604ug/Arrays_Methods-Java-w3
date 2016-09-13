package com.anthony;

import java.util.Scanner;

public class Main {
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What string would you like me to parse an array of integers from? ");
        // Get the number from the user
        String userNumber = stringScanner.nextLine();
        // Call method to transfer each character into an int array
        int userNumArray[] = convertToIntArray(userNumber);
        // Testing - print each character
        for (int number:userNumArray) {
            System.out.println(number);
        }
        // Close scanners
        numberScanner.close();
        stringScanner.close();
    }
    // Method to convert a string to an array of integers
    private static int[] convertToIntArray(String userNumber) {
        // Converts the users number into a char array
        char userCharArray[] = userNumber.toCharArray();
        // Create an integer array to store each number
        int numberArray[] = new int[userCharArray.length];
        int currentArrayPos = 0;
        for (char currentChar:userCharArray) {
            // Character.getNumericValue(char c) gets the value of the char
            // http://stackoverflow.com/questions/19388037/converting-characters-to-integers-in-java
            // http://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#getNumericValue%28char%29
            numberArray[currentArrayPos] = Character.getNumericValue(currentChar);
            // Increment current array position
            currentArrayPos ++;
        }
        return numberArray;
    }

}
