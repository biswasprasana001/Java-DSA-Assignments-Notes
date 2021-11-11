package com.company;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Three Numbers to find Min & Max: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int maxNum = max(num1, num2, num3);
        System.out.println("The max among 3 is " + maxNum);
        int minNum = min(num1, num2, num3);
        System.out.println("The min among 3 is " + minNum);
    }

    static int max(int num1, int num2, int num3) {
        int maxNum = num1;
        if (num2 > maxNum) {
            maxNum = num2;
        }
        if(num3 > maxNum) {
            maxNum = num3;
        }
        return maxNum;
    }

    static int min(int num1, int num2, int num3) {
        int minNum = num1;
        if (num2 < minNum) {
            minNum = num2;
        }
        if(num3 < minNum) {
            minNum = num3;
        }
        return minNum;
    }
}
