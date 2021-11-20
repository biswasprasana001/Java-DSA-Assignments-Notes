package com.company;

public class findNumbers {
    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        findNumbers(nums);
    }
    static int findNumbers(int[] nums) {
        int count2 = 0;
        for(int i = 0; i < nums.length; i++) {
            int num;
            int count1 = 0;
            num = nums[i];
            while(num > 0) {
                num = num/10;
                count1++;
            }
            if(count1 % 2 == 0) {
                count2++;
            }
        }
        return count2;
    }
}
