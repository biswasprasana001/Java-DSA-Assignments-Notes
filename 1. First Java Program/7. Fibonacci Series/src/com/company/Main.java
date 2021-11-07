package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b);
        for (int i = 1; i <= num - 2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + b);
        }
    }
}