package com.company;

import java.util.ArrayList;
import java.util.List;

public class luckyNumbers {
    public static void main(String[] args) {
        int[][] matrix = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        luckyNumbers(matrix);
    }
   static List<Integer> luckyNumbers (int[][] matrix) {
       ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (checkMinRow(matrix[i][j]) && checkMaxColmn(matrix[i][j])) {
                    list.add(matrix[i][j]);
                }
            }
        }
       return list;
   }
}
