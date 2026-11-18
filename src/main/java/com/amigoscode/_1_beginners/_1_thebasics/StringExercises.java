package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Strings
 *
 * Learn how to work with Strings in Java.
 * Strings are objects that represent sequences of characters and come with
 * many useful built-in methods.
 */
public class StringExercises {

    public static void main(String[] args) {

        String message = "Hello, Welcome to Amigoscode!";
        String padded = "   Hello World   ";
        String csv = "apple,banana,cherry,date,elderberry";

        // TODO: 1 - Get the length of the 'message' string and print it
        // Hint: Use the .length() method
        int length = message.length();
        System.out.println(length);

        // TODO: 2 - Convert 'message' to uppercase and lowercase, and print both
        // Hint: Use .toUpperCase() and .toLowerCase()
        String uppercaseMessage = message.toUpperCase();
        String lowercaseMessage = message.toLowerCase();
        System.out.println("Lowercase: " + lowercaseMessage);
        System.out.println("Uppercase: " + uppercaseMessage);


        // TODO: 3 - Get a substring of 'message' containing the first 5 characters and print it
        // Hint: Use .substring(startIndex, endIndex)
        String sub = message.substring(0, 5);
        System.out.println("5 char substring: " + sub);

        // TODO: 4 - Check if 'message' contains the word "Amigoscode" and print the result
        // Hint: Use .contains()
        boolean containsWord = message.contains("Amigoscode");
        System.out.println(containsWord);

        // TODO: 5 - Replace "Amigoscode" with "Java" in 'message' and print the new string
        // Hint: Use .replace(oldValue, newValue)
        String newMessage = message;
        newMessage.replace("Amigoscode", "Java");
        System.out.println(newMessage);

        // TODO: 6 - Trim the whitespace from the 'padded' string and print the result
        // Hint: Use .trim()
        System.out.println(padded.trim());


        // TODO: 7 - Split the 'csv' string by commas into a String array and print each element
        // Hint: Use .split(",") then loop through the resulting array
        String[] characters = csv.split(",");
        for (String letter: characters) {
            System.out.println(letter);
        }


        // TODO: 8 - Check if two strings are equal using .equals() (not ==)
        // Create two String variables with the same text content and compare them.
        // Print the result of .equals() and explain why == may not work for Strings.
        String string1 = "hello";
        String string2 = "hello";
        System.out.println(string1.equals(string2));

    }
}
