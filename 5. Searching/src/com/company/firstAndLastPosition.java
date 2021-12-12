package com.company;

import java.util.Arrays;

public class firstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        System.out.println(Arrays.toString(searchRng(nums, target)));
    }
    static int[] searchRng(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }
    static int search (int[] nums, int target, boolean firstStartIndex) {
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int m = s + ((e - s)/2);
            if (nums[m] < target) {
                e = m - 1;
            } else if (target < nums[m]) {
                s = m + 1;
            } else {
                ans = m;
                if (firstStartIndex) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return ans;
    }
}
