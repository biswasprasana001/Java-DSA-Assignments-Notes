package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int sum = 0;
        int num = input.nextInt();
        System.out.println("Enter a Number to Check: ");
        int check = input.nextInt();
        while (num != 0) {
            int rem = num % 10;
            if (rem == check) {
                sum += 1;
            }
            num = num/10;
        }
        System.out.println(sum);
    }
}
