package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number ");
        double num1 = input.nextDouble();
        System.out.print("Enter Another Number ");
        double num2 = input.nextDouble();
        if (num1 > num2) {
            System.out.print(num1 + " is greater");
        }
        else {
            System.out.print(num2 + " is greater");
        }

    }
}
