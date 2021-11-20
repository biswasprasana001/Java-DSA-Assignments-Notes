package com.company;

import java.util.Arrays;

public class runningSum {
    public static int[] main(String[] args) {
        int [] nums = {3, 1, 2, 10, 1};
        int[] runningSum = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if (i == 0) {
                runningSum[i] = nums[i];
            }
            else {
                runningSum[i] = runningSum[i-1] + nums[i];
            }
        }
        return runningSum;
    }
}
