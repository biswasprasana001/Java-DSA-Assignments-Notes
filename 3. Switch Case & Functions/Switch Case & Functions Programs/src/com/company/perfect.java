package com.company;

import java.util.Scanner;

public class perfect {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a Number: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            perfect(num1, num2);
        }

        static void perfect(int num1, int num2) {
            while (num1 < num2) {
                int facSum = 0;
                int f = 1;
                while (f < num1) {
                    if (num1 % f == 0) {
                        facSum += f;
                    }
                    f++;
                }
                if (facSum == num1) {
                    System.out.println(num1);
                }
                num1++;
            }
        }
    }

