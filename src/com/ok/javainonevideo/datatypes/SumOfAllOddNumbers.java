package com.ok.javainonevideo.datatypes;

import java.util.Scanner;

public class SumOfAllOddNumbers {

    // Function to calculate and print sum of odd numbers from 1 to n
    public static void printSumOfOddNumbers(int n) {
        int sum = 0;

        // Loop through odd numbers only
        for (int i = 1; i <= n; i += 2) {
            sum += i; // add odd number to sum
        }

        System.out.println("Sum of all odd numbers from 1 to " + n + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printSumOfOddNumbers(num);

        sc.close();
    }
}
