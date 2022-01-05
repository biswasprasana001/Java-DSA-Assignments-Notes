package com.company;

public class binarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 6;
        int output = binarySearch(arr, target);
        System.out.println(output);
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
