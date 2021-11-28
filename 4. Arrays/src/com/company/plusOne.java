package com.company;

import java.util.ArrayList;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {9};
        plusOne(digits);
    }
    static ArrayList<Integer> plusOne(int[] digits) {
        int num1 = 0;
        for (int i = 0; i < digits.length; i++) {
            num1 += digits[i];
            num1 *= 10;
        }
        num1 /= 10;
        num1++;
        int revNum = 0;
        int rem1;
        int num2 = num1;
        while (num2 != 0) {
            rem1 = num2 % 10;
            num2 /= 10;
            revNum += rem1;
            revNum *= 10;
        }
            revNum /= 10;
        int testNum = revNum * 10;
        int rem2;
        int noOfDigits = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (revNum != 0) {
            rem2 = revNum % 10;
            list.add(rem2);
            if (num1 == testNum) {
                list.add(0);
            }
            revNum /= 10;
        }
        System.out.println(list);
        return list;
    }
}
