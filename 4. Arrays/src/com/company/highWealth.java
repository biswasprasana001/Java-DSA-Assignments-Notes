package com.company;

import java.util.Arrays;

public class highWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 4, 5, 6 }, {7, 8, 9} };
        int out = maximumWealth(accounts);
        System.out.println(out);
    }
    static int maximumWealth(int[][] accounts) {
        int[] total = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for(int j = 0; j < accounts[i].length; j++) {
                total[i] += accounts[i][j];
            }
        }
        int max = 0;
        for (int i = 0; i < total.length; i++) {
            if(total[i] > max) {
                max = total[i];
            }
        }
        return max;
    }
}
