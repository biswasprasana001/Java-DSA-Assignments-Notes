package com.company;

import java.util.Scanner;

public class factorial
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int output = factorial(num);
        System.out.println("The Factorial is " + output);
    }
    static int factorial(int num) {
        int fact = 1;
        while(num > 0) {
            fact *= num;
            num--;
        }
        return fact;
    }
}