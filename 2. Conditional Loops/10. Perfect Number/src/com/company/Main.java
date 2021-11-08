package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        while (num1 < num2) {
            int num = num1;
            int c = 1;
            int sum = 0;
            while (c < num) {
                if (num % c == 0) {
                    sum += c;
                }
                c++;
            }
            if (sum == num) {
                System.out.println(num);
            }
            num1++;
        }
    }
}
