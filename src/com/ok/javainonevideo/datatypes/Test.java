package com.ok.javainonevideo.datatypes;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name : ");
        String name = sc.next();

        System.out.println("What is your age : ");
        int age  = sc.nextInt();

        System.out.println("Hello " + name + ", your age is " + age + " And YOUU are BATMANN!!");

    }
}
