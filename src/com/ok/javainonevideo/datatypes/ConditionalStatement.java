package com.ok.javainonevideo.datatypes;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();

        System.out.println("You entered " + marks);

        if(marks >= 90){
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 45) {
            System.out.println("Grade C");
        }else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
