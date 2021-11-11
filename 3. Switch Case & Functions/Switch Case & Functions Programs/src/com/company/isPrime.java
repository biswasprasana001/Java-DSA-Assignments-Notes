package com.company;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        String out = isPrime(num);
        System.out.println(out);
    }

    static String isPrime(int num) {
        if (num <= 1) {
            return "Not Prime";
        }
        int c = 2;
        while (c*c <= num) {
            if (num % c == 0) {
                return "Not Prime";
            }
            c++;
        }
        return "Prime";
    }
}
