package com.company;

public class findPivot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int pivot = pivot(arr);
        System.out.println(pivot);
    }
    static int pivot(int[] arr) {
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
}
