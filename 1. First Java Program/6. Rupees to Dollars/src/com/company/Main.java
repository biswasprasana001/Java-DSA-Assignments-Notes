package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value in Rupees ");
        double inr = input.nextDouble();
        double usd = inr / 75;
        System.out.println("The Dollar Value is " + usd);
    }
}
