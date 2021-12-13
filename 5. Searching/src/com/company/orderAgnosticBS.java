package com.company;

public class orderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int [] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        boolean isAsc = arr[s] < arr[arr.length - 1];
        while (s <= e) {
            int m = s + ((e - s)/2);
            if (arr[m] == target) {
                return m;
            }
            if (isAsc) {
                if (target < arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (arr[m] > target) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }
}
