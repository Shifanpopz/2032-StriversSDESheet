package io.javabrains.javabasics;

import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0, largest = Integer.MIN_VALUE;

        // Step 2: Use arrays and array operations to find the sum, average, and largest
        // number in the array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        double avg = sum / (double) N;
        System.out.println("The sum of array elements : " + sum);
        System.out.println("The largest number in array : " + largest);
        System.out.println("The avg of the array elements : " + avg);

    }
}
