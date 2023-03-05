package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int age = 32;
        // long variable to store a long value
        long l = 12345577L;
        // float variable to store a floating-point value
        float dec = 123.33f;

        // double variable to store a double value
        double d = 1111.222222;

        // char variable to store a single character
        char ch = 'a';

        // boolean variable to store a boolean value
        boolean isskyblue = true;

        // String variable to store a string of characters
        String intro = "Im new to backend";

        // Step 2: Print the values of the variables to the console
        System.out.println("Integer : " + age);
        System.out.println("Float : " + dec);

        System.out.println("Long : " + l);
        System.out.println("Decimal : " + d);
        System.out.println("Char : " + ch);
        System.out.println("String : " + intro);
        System.out.println("Boolean value : " + isskyblue);

        // Step 3: Modify the values of the variables and print the updated values

        ch = 'z';
        age = 100;
        System.out.println("Char : " + ch);

        System.out.println("Integer : " + age);
    }
}
