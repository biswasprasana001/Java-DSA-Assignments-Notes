package com.company;

public class splitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int m = 2;
        int out = splitArray(arr, m);
        System.out.println(out);
    }

    static int splitArray(int[] arr, int m) {
        int sum = 0;
        int max = 0;
        for (int val : arr) {
            sum += val;
            max = Math.max(val, max);
        }
        if (m == arr.length) {
            return max;
        }
        int start = max;
        int end = sum;
        int ans = 0;
        while (start < end) {
            int mid = start + ((end - start)/2);
            if (isPossible(arr, mid, m)) {
                ans = mid;
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static boolean isPossible(int[] arr, int mid, int m) {
        int arySplit = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > mid) {
                arySplit++;
                sum = arr[i];
            }
        }
        return arySplit <= m;
    }
}
