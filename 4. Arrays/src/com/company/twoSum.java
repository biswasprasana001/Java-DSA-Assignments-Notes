package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum(int[] nums, int target) {
        int[] numsij = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    numsij[0] = i;
                    numsij[1] = j;
                }
            }
        }
        return numsij;
    }
}
