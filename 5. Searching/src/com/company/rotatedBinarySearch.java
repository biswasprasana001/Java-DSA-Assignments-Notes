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
        if (arr[pivot] == -1) {
            binarySearch(arr, target, 0, arr.length - 1);
        }
        if (target == arr[pivot]) {
            return pivot;
        }
        if (target > arr[arr.length - 1]) {
//          if (target > arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int findPivot(int[] arr) {
//        Sumit Sir Method
//        int s = 0;
//        int e = arr.length - 1;
//        while (s < e) {
//            int m = s + ((e - s) / 2);
//            if (arr[s] > arr[e]) {
//                e = m;
//            } else {
//                s = m + 1;
//            }
//        }
//        return s;

//          Kunal Kushwaha Method
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                // 4 cases over here
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid-1;
                }
                if (arr[mid] < arr[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }

    static int binarySearch (int[] arr, int target, int s, int e) {
        while (s <= e) {
            int m = s + ((e - s)/2);
            if (arr[m] == target) {
                return m;
            } else if (target < arr[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return - 1;
    }
}
