package com.company;

public class diagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{7, 3, 1, 9},{3, 4, 6, 9},{6, 9, 6, 6},{9, 5, 8, 5}};
        diagonalSum(mat);
    }
    static int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[i][(mat.length - 1) - i];
        }
        if(mat.length % 2 != 0) {
            sum -= mat[mat.length/2][mat.length/2];
        }
        System.out.println(sum);
        return sum;
    }
}
