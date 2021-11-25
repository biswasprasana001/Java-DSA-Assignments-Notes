package com.company;

import java.util.Arrays;

public class findRotation {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(findRotation(mat, target));
    }
    public static boolean findRotation (int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if(check(mat, target)) {
                return true;
            }
            rotate(mat);
        }
        return false;
    }
    static boolean check (int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    static void rotate (int[][] mat) {
        int temp = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        int start = 0;
        int end = mat.length - 1;
        while (start <= end) {
            for (int i = 0; i < mat.length; i++) {
                temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
            }
            start++;
            end--;
        }
    }
}
