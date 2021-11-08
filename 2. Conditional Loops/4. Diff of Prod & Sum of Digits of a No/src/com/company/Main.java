package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        int sum = 0;
        int prod = 1;
        int diff;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            prod *= rem;
            num /= 10;
        }
        diff = prod - sum;
        System.out.println("The Difference is " + diff);
    }
}
