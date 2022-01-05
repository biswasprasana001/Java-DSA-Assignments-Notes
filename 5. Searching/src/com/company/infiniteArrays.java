package com.company;

public class infiniteArrays {
    public static void main(String[] args) {
        // This is a Case, This Solution is Only Applicable to Infinite Arrays
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 3;
        int out = ans(arr, target);
        System.out.println(out);
    }
    static int ans(int[] arr, int target) {
        int start = 0;
        int temp;
        int end = 1;
        while (target > arr[end]) {
            temp = end + 1;
            end = end + (end - start + 1)*2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
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
