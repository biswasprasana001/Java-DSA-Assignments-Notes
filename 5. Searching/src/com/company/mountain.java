package com.company;

public class mountain {
    public static void main(String[] args) {

    }
    static int peakIndexInMountainArray(int[] num) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            int mid = start + ((end - start)/2);
            if (mid < mid + 1) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; // or mid as both mid and end are at the same position
    }
}
