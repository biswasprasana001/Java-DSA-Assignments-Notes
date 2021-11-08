package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Input a Number to Generate it's Factors: ");
        int num = input.nextInt();
        int c = 1;
        while (c <= num) {
            if (num % c == 0) {
                System.out.println(c);
            }
            c++;
        }
    }
}
