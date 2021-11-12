package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        char op = in.next().trim().charAt(0);
        calculator(num1, num2, op);
    }
    static void calculator(double num1, double num2, char op) {
        switch (op) {
            case '+':
                System.out.println("The Sum is " + (num1 + num2));
                break;
            case '-':
                if (num1 > num2) {
                    System.out.println("The Diff is " + (num1 - num2));
                }
                else {
                    System.out.println("The Diff is " + (num2 - num1));
                }
                break;
            case '*':
                System.out.println("The Product is " + (num1 * num2));
                break;
            case '/':
                double div = num1/num2;
                System.out.println("The Quotient is " + div);
                break;
            default:
                System.out.println("Enter Valid Operator");
        }
    }
}
