package io.javabrains.javabasics;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int a = 125, b = 100;
        System.out.println("The value of a : " + a);
        System.out.println("The value of b : " + b);
        // Step 2: Perform arithmetic operations
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;

        // Step 3: Print the results of the arithmetic operations
        System.out.println("Addition : " + addition);
        System.out.println("Subtraction : " + subtraction);
        System.out.println("Multiplication : " + multiplication);
        System.out.println("Division : " + division);
        System.out.println("Modulus : " + modulus);
        // Step 4: Perform increment and decrement operations
        int incre = ++a;
        int decre = --a;

        // Step 5: Print the results of the increment and decrement operations

        System.out.println("The result of Increment of a is " + incre);
        System.out.println("The result Decrement of a is " + decre);

        // Step 6: Perform comparison operations
        boolean isgreater = a > b;
        boolean issmaller = a < b;
        boolean isequal = a == b;
        boolean issmallerandeualto = a <= b;
        boolean isgreaterandequalto = a >= b;
        boolean isnotequalto = a != b;

        // Step 7: Print the results of the comparison operations
        System.out.println("a > b : " + isgreater);
        System.out.println("a < b : " + issmaller);
        System.out.println("a >= b : " + isgreaterandequalto);
        System.out.println("a <= b : " + issmallerandeualto);
        System.out.println("a == b : " + isequal);
        System.out.println("a != b :" + isnotequalto);

        // Step 8: Perform logical operations
        boolean cond1 = isequal && isnotequalto;
        boolean cond2 = isequal || isnotequalto;
        boolean cond3 = !(isnotequalto);
        // Step 9: Print the results of the logical operations
        System.out.println("isequal && isnotequalto : " + cond1);
        System.out.println("isequal || isnotequalto :" + cond2);
        System.out.println("!(isnotequalto) : " + cond3);
    }
}
