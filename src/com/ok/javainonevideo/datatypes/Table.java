package com.ok.javainonevideo.datatypes;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.print("Enter a number to print its table : ");

        Scanner sc = new Scanner(System.in);
        int table  = sc.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println(table + "x" + i + "=" + (table*i));
        }
        sc.close();
    }
}
