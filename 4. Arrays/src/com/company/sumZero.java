package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class sumZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int n = in.nextInt();
        System.out.println(Arrays.toString(sumZero(n)));
    }

    static int[] sumZero(int n) {
        int[] arr = new int[n];
        if (n % 2 != 0) {
            arr[0] = 0;
                for (int i = 1; i < (arr.length + 1)/2; i++) {
                    arr[i] = i;
                    arr[(arr.length-1) - (i-1)] = -i;
                }
            }
        else {
            for (int i = 0; i < arr.length/2; i++) {
                arr[i] = i + 1;
                arr[(arr.length-1) - (i)] = -(i + 1);
            }
        }
        return arr;
        }
    }
