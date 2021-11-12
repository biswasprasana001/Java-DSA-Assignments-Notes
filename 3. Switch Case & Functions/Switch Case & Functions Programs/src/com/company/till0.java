package com.company;

import java.util.Scanner;

public class till0 {
    public static void main(String[] args) {
        System.out.println("Keep on Entering Numbers until You Press 0 which will Take out the Sum: ");
        till0();
    }
    static void till0() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true) {
            int num = in.nextInt();
            if(num != 0) {
                sum += num;
            }
            else {
                break;
            }
        }
        System.out.println("Sum is " + sum);
    }
}

