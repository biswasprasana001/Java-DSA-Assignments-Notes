package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an Alphabet: ");
            char alp = input.next().trim().charAt(0);
            if (alp != '0') {
                if (alp >= 'a' && alp <= 'z' || alp >= 'A' && alp <= 'Z') {
                    if (alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o' || alp == 'u' || alp == 'A' || alp == 'E' || alp == 'I' || alp == 'O' || alp == 'U') {
                        System.out.println("Vowel");
                    } else {
                        System.out.println("Consonant");
                    }
                } else {
                    System.out.println("Enter a Valid Character");
                }
            } else {
                System.out.println("Program Exited");
                break;
            }
        }
    }
}
