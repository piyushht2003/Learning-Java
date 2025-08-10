package com.ok.javainonevideo.Functions;

import java.util.Scanner;

public class Average {
    //Function to calculate the average
    public static double printAverage(double a, double b, double c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking inputs
        System.out.print("Enter the first number : ");
        double n1 = sc.nextDouble();

        System.out.print("Enter the second number : ");
        double n2 = sc.nextDouble();

        System.out.print("Enter the third number : ");
        double n3 = sc.nextDouble();

        //Calling the function
        double Average = printAverage(n1, n2, n3 );
        System.out.println("The average of the number is : " + Average);

        sc.close();
    }
}
