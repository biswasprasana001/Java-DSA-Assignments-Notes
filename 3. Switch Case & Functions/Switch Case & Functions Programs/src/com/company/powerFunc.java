package com.company;

import java.util.Scanner;

public class powerFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number to be Powered: ");
        int num = in.nextInt();
        System.out.println("Enter the Power: ");
        int pow = in.nextInt();
        int output = power(num, pow);
        System.out.println(output);
    }
    static int power(int num, int pow) {
        int powNum = 1;
        for (int i = 1; i <= pow; i++) {
            powNum *= num;
        }
        return powNum;
    }
}
