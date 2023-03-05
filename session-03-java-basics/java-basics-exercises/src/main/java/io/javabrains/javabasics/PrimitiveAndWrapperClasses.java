package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int age = 10;
        short short_val = 123;
        byte byte_val = 12;
        double dec = 12.2222222;
        float floating = 234.123f;
        long long_value = 1112223333L;
        char ch = 'a';
        boolean bool = true;

        // Step 2: Convert primitive variables to wrapper objects
        Integer i = age;
        Float f = floating;
        Double d = dec;
        Long l = long_value;
        Character c = ch;
        Boolean b = bool;
        Short s = short_val;
        Byte by = byte_val;

        // Step 3: Print the values of the wrapper objects
        System.out.println("Values of Wrapper Objects :");
        System.out.println("Integer : " + i);
        System.out.println("Float : " + f);
        System.out.println("Double : " + d);
        System.out.println("Long : " + l);
        System.out.println("Boolean : " + b);
        System.out.println("Short : " + s);
        System.out.println("Byte : " + by);
        System.out.println("Char : " + c);
        // Step 4: Convert wrapper objects back to primitive variables
        int age1 = i;
        short short_val1 = s;
        byte byte_val1 = by;
        double dec1 = d;
        float floating1 = f;
        long long_value1 = l;
        char ch1 = c;
        boolean bool1 = b;
        // Step 5: Print the values of the primitive variables
        System.out.println("Values of Primitive variables :");
        System.out.println("Integer : " + age1);
        System.out.println("Float : " + floating1);
        System.out.println("Double : " + dec1);
        System.out.println("Long : " + long_value1);
        System.out.println("Boolean : " + bool1);
        System.out.println("Short : " + short_val1);
        System.out.println("Byte : " + byte_val1);
        System.out.println("Char : " + ch1);

    }
}
