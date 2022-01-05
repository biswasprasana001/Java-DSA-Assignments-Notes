package com.company;

import java.util.Arrays;

public class firstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 5};
        int target = 3;
        int[] out = searchRng(arr, target);
        System.out.println(Arrays.toString(out));
    }
    static int[] searchRng(int[] arr, int target) {
        int[] out = {-1, -1};
        out[0] = binarySearch(arr, target, "first");
        if (out[0] != -1) {
            out[1] = binarySearch(arr, target, "second");
        }
        return out;
    }
    static int binarySearch(int[] arr, int target, String toDo) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start - ((start - end)/2);
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (toDo.equals("first")) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
