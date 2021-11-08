package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum = 0;
        int i = 0;
        System.out.println("Enter Numbers to be Averaged: To Stop Calculating the Avg Enter '0' ");
        while(true) {
            float num = input.nextFloat();
            if(num != 0) {
                sum += num;
                i++;
            }
            else {
                break;
            }
        }
        System.out.println("The Avg of the given " + i + " numbers are " + (sum/i));
    }
}
