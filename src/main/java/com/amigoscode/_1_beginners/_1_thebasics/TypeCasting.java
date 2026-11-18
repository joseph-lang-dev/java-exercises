package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Type Casting
 *
 * Learn how to convert between different data types in Java.
 * Widening (implicit): smaller type -> larger type (e.g., int -> double)
 * Narrowing (explicit): larger type -> smaller type (e.g., double -> int)
 */
public class TypeCasting {

    public static void main(String[] args) {

        // TODO: 1 - Widen an int to a double (implicit casting)
        // Declare an int variable with any value, then assign it to a double variable.
        // Print both variables to see the result.
        int val = 25;
        double val2 = val;
        System.out.println(val);
        System.out.println(val2);

        // TODO: 2 - Narrow a double to an int (explicit casting)
        // Declare a double variable (e.g., 9.78), then cast it to an int.
        // Print both variables to see what happens to the decimal part.
        double num = 9.90;
        int num2 = (int) num;
        System.out.println(num);
        System.out.println(num2);


        // TODO: 3 - Cast an int to a char to get the character it represents
        // Hint: int value 65 corresponds to 'A' in ASCII
        // Print the resulting char.
        int number = 65;
        char asc = (char) number;
        System.out.println(asc);


        // TODO: 4 - Cast a char to an int to get its ASCII value
        // Hint: char 'Z' has an ASCII value of 90
        // Print the resulting int.
        char letter = 'Z';
        int value = (int) letter;
        System.out.println(value);


        // TODO: 5 - Convert a String "42" to an int using Integer.parseInt()
        // Declare a String variable with the value "42", then parse it to an int.
        // Print the result.
        String numString = "42";
        int res = Integer.parseInt(numString);
        System.out.println(res);


        // TODO: 6 - Convert an int 42 to a String using String.valueOf()
        // Declare an int variable with the value 42, then convert it to a String.
        // Print the result.
        int value2 = 42;
        String result2 = String.valueOf(value2);
        System.out.println(result2);

    }
}
