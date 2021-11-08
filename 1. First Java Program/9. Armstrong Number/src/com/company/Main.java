package com.company;
import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Two Numbers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        for (int i = num1; i <= num2; i++) {
            int check = i;
            int sum = 0;
            while (check != 0) {
                int rem = check%10;
                int pow = (int) Math.pow(rem, 3);
                sum += pow;
                check = check/10;
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
    }
}
