package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class maxSubArray {
    public static void main (String[] args) {
        int[] nums = {-1};
        maxSubArray (nums);
    }
    static int maxSubArray (int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                list.add(sum);
            }
        }
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }
    }
