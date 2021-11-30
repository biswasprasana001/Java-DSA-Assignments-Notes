package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if(digits[0] == 0) {
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }
}
