package com.company;

public class findInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2};
        int target = 3;
        int out = search(arr, target);
        System.out.println(out);
    }
    static int search(int[] arr, int target) {
        int peak = peakIndexMountainArray(arr);
        if (target == arr[peak]) {
            return peak;
        }
        int out = binarySearch(arr, target, 0, peak - 1);
        if (out == -1) {
            out = binarySearch(arr, target, peak, arr.length - 1);
        }
        return out;
    }
    static int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start - ((start - end)/2);
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = end - ((end - start)/2);
            if (arr[mid] < target) {
                if (isAsc) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else if (target < arr[mid]) {
                if (isAsc) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                return mid;
            }
        }
        return -1;
    }
}


