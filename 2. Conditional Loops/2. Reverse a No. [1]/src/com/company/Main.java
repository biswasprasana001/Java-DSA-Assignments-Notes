package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a No. to Reverse: ");
                int num = input.nextInt();
                String modNum = "";
                while (num != 0) {
                    int rem = num % 10;
                    modNum += rem;
                    num = num/10;
                }
                System.out.println("The Reversed No. is " + modNum);
            }
        }


