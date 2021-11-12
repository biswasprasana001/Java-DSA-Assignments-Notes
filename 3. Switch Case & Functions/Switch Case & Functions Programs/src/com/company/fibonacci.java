package com.company;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        fibonacci(num);
    }

    static void fibonacci(int num) {
        int num1 = 0;
        int num2 = 1;
        int temp;
        System.out.print(num1 + " " + num2);
        for(int i = 3; i <= num; i++) {
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            System.out.print(" " + num2);
        }
    }
}
