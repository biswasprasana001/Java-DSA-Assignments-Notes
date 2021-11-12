package com.company;

import java.util.Scanner;

public class RngOfArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num1 = in.nextInt();
        long num2 = in.nextInt();
        RngOfArmstrong(num1, num2);
    }
    static void RngOfArmstrong(long num1, long num2) {
        while (num1 <= num2) {
            long checkNum = num1;
            long sumCube = 0;
            while (checkNum > 0) {
                long rem = checkNum % 10;
                checkNum = checkNum / 10;
                sumCube += Math.pow(rem, 3);
            }
            if (sumCube == num1) {
                System.out.print(sumCube + " ");
            }
            num1++;
        }
    }
}
