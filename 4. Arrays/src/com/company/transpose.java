package com.company;

import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}, {7, 8, 9}};
        transpose(matrix);
    }
    static int[][] transpose(int[][] matrix) {
        int m = 0;
        int num = 0;
        int n = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
             num++;
            }
            System.out.println(Arrays.toString(matrix[i]));
            m++;
        }
        System.out.println(m);
        n = num/m;
        System.out.println(n);
        int[][] transpose = new int[n][m];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] += matrix[j][i];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            System.out.println(Arrays.toString(transpose[i]));
        }
        return transpose;
    }
}
