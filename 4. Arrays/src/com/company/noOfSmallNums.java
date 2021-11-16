package com.company;

import java.util.Arrays;

public class noOfSmallNums {
    public static void main(String[] args) {
        int[] num = {7, 7, 7, 7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(num)));

    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] noOfSmallNums = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    count++;
                }
            }
            noOfSmallNums[i] = count;
            count = 0;
        }
        return noOfSmallNums;
    }
}
