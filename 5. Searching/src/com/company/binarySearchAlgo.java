package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 3, 5, 9, 14, 16, 18};
        int target = 14;
        int out = ceiling(arr, target);
    }
    static int ceiling(int[] arr, int target) {
        int s = arr[0];
        int e = arr[arr.length - 1];
        while(s > e) {
            int m = s + ((e-s)/2);
            if (target > arr[m]) {
                s = m + 1;
            }
            else if (target < arr[m]) {
                e = m - 1;
            }
            else {
                return m;
            }
        }
        System.out.println(s);
        return s;
    }
}
