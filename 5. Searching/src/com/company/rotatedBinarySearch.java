package com.company;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int target = 2;
        int out = searchArray(arr, target);
        System.out.println(out);
    }
    static int searchArray(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        } else {
            int out = binarySearch(arr, target, 0, pivot);
            if (out == -1) {
                out = binarySearch(arr, target, pivot + 1, arr.length - 1);
            }
            return out;
        }
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start - ((start - end)/2);
            if (start < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (start < end && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            } else if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = end - ((end - start)/2);
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
