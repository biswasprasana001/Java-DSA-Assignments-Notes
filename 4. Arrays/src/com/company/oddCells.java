package com.company;

import java.util.Arrays;

public class oddCells {
    public static void main(String[] args) {
        int[][] indices = {{1, 1}, {0, 0}};
        oddCells(2 , 2, indices);
    }
    static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[i].length; j++) {
                if (j == 0) {
                    for (int k = 0; k < arr[indices[i][j]].length; k++) {
                        arr[indices[i][j]][k] += 1;
                    }
                }
                if (j == 1) {
                    for (int k = 0; k < m; k++) {
                        arr[k][indices[i][j]] += 1;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
