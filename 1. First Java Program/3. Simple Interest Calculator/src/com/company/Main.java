package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal Amt: ");
        double p = input.nextDouble();
        System.out.print("Enter ROI: ");
        double r = input.nextDouble();
        System.out.print("Enter Time Period; ");
        double t = input.nextDouble();
        double si = p * (1 + (r*t));
        System.out.println("The Simple Interest is " + si);
    }
}
