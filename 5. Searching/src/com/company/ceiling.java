package com.company;

public class ceiling {
    public static void main(String[] args) {
        int[] arr  = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = s + ((e - s)/2);
            if (arr[m] < target) {
                s = m + 1;
            } else if (target < arr[m]) {
                e = m - 1;
            } else {
                return m;
            }
        }
        return s;
    }
}
