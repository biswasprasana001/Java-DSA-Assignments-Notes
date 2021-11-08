package com.company;
import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an Operator: ");
            char op = input.next().trim().charAt(0);
            if (op == 'x'){
                System.out.println("Program Stopped");
                break;
            }
            System.out.print("Enter a Two Numbers: ");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            if (op == '+') {
                double sum = num1 + num2;
                System.out.println("Sum is " + sum);
            } else if (op == '-') {
                double diff;
                if (num1 >= num2) {
                    diff = num1 - num2;
                } else {
                    diff = num2 - num1;
                }
                System.out.println("Difference is " + diff);
            } else if (op == '*') {
                double pro = num1 * num2;
                System.out.println("The product is " + pro);
            } else if (op == '/') {
                if (num2 != 0) {
                    double quo = num1 / num2;
                    System.out.println("Quotient is " + quo);
                } else {
                    System.out.println("Enter A Valid Second Number");
                }
            }
            else {
                System.out.println("Enter a Valid Operator");
            }
        }
    }
}