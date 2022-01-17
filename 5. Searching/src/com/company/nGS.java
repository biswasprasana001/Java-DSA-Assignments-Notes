package com.company;

public class nGS {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
        char target = 'f';
        int out = leastUpperBound(arr, target);
        System.out.println(out);
    }
    static int leastUpperBound(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start < end) {
            mid = start - (start - end)/2;
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start%(arr.length-1);
    }
}
