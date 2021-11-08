package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter n: ");
            int n = input.nextInt();
            if (n != 0) {
                System.out.print("Enter r: ");
            int r = input.nextInt();
            int diff = n - r;
            if (n > r) {
                int testN = n;
                int factN = 1;
                while (testN != 0) {
                    factN *= testN;
                    testN--;
                }
                int testR = r;
                int factR = 1;
                while (testR != 0) {
                    factR *= testR;
                    testR--;
                }
                int testD = diff;
                int factD = 1;
                while (testD != 0) {
                    factD *= testD;
                    testD--;
                }
                System.out.println("The nPr is " + (factN) / (factD));
                System.out.println("The nCr is " + (factN) / ((factR) * (factD)));
            }
            else {
                System.out.println("n should be greater than r");
            }
        } else {
                System.out.println("Program Ended");
                break;
            }
        }
    }
}
