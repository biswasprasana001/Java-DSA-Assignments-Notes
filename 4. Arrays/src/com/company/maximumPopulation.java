package com.company;

public class maximumPopulation {
    public static void main(String[] args) {
        int[][] logs = {{1993, 1999},{2000, 2010}};
        maximumPopulation(logs);
    }
    static int maximumPopulation(int[][] logs) {
        int count = 0;
        for (int i = 0; i < logs.length - 1; i++) {
            if (logs[i][1] == logs[i+1][0]) {
                count += 2;
            }
        }
        return 0;
    }
}
