package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a No. to Reverse: ");
        int num = input.nextInt(); // works for any no. except when zeroes are present on either side.
        int revNum = 0;
        while (num != 0) {
            int rem = num%10;
            revNum += rem;
            revNum *= 10;
            num = num/10;
        }
        System.out.println("The Reversed No. is " + (revNum/10));
    }
}
