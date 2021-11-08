package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a Number: ");
            int num = input.nextInt();
            if(num != 0) {
                sum += num;
            }
            else {
                break;
            }
        }
        System.out.println("The Sum is " + sum);
    }
}
