package com.company;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Num to check whether it is Palindrom or Not: ");
        int num = in.nextInt();
        isPalindrome(num);
    }
    static void isPalindrome(int num) {
        int testNum = num;
        int revNum = 0;
        while (testNum > 0) {
            int rem = testNum % 10;
            testNum = testNum/10;
            revNum += rem;
            revNum *= 10;
        }
        revNum = revNum/10;
        if (revNum == num) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
