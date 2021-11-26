package com.company;

import java.util.ArrayList;
import java.util.List;

public class luckyNumbers {
    public static void main(String[] args) {
        int[][] matrix = {{3,6},{7,1},{5,2},{4,8}};
        System.out.println(luckyNumbers(matrix));
    }
    static List<Integer> luckyNumbers (int[][] matrix) {
       ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (checkMinRow(matrix, matrix[i][j], i) && checkMaxColmn(matrix, matrix[i][j], j)) {
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
   }
   static boolean checkMinRow(int[][] matrix, int num, int rowNum) {
        for (int i = 0; i < matrix[rowNum].length; i++) {
            if (num > matrix[rowNum][i]) {
                return false;
            }
        }
       return true;
   }
   static boolean checkMaxColmn (int [][] matrix, int num, int colNum) {
        for (int i = 0; i < matrix.length; i++) {
            if (num < matrix[i][colNum]) {
                return false;
            }
        }
        return true;
   }
}
