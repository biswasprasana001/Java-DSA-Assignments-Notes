package com.company;

public class matrixReshape {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        matrixReshape(mat, r, c);
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] arr = new int[r][c];
        int sr = 0;
        int sc = 0;
        if (m*n == r*c) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (sc == c) {
                        sc = 0;
                        sr++;
                    }
                    arr[sr][sc] = mat[i][j];
                    sc++;
                }
            }
            return arr;
        }
        return mat;
    }
}
