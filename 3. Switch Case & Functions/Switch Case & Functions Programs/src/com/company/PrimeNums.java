package com.company;

import java.util.Scanner;

public class PrimeNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        primeNums(num1, num2);
    }

    static void primeNums(int num1, int num2) {
        while (num1 <= num2) {
            if(isPrime(num1)) {
                System.out.println(num1);
            }
            num1++;
        }
    }

    static boolean isPrime(int num1){
        if (num1 > 2) {
            int c = 2;
            while (c * c < num1) {
                if (num1 % c == 0) {
                    return false;
                }
                c++;
            }
            return true;
        }
        return false;
    }
}
