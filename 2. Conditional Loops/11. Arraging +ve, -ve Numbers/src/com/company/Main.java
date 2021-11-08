package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negSum = 0;
        int postSum = 0;
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Enter Integers: ");
        while(true) {
            int num = input.nextInt();
            if (num > 0) {
                postSum += num;
                if (num % 2 == 0) {
                    evenSum += num;
                }
                else {
                    oddSum += num;
                }
            }
            else if (num < 0) {
                negSum += num;
                if (num % 2 == 0) {
                    evenSum += num;
                }
                else {
                    oddSum += num;
                }
            }
            else {
                System.out.println("The End");
            break;
            }
        }
        System.out.println("The Sum of -ve Numbers are: " + negSum);
        System.out.println("The Sum of +ve Numbers are: " + postSum);
        System.out.println("The Sum of Even Numbers are: " + evenSum);
        System.out.println("The Sum of Odd Numbers are: " + oddSum);
    }
}
