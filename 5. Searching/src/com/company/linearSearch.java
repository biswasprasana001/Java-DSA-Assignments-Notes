package com.company;

public class linearSearch {
    public static void main(String[] args) {
        int[] num = {12, 345, 2, 6, 7896};
        int out = evenNums(num);
        System.out.println(out);
    }
    static int evenNums(int[] num) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (even(num[i])) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {
        if (noOfDigits(num) % 2 == 0) {
            return true;
        }
        return false;
    }
    static int noOfDigits(int num) {
        if (num < 0) {
            num *= -1;
        } if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }
}
