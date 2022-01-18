package com.company;

import java.util.Scanner;

public class splitArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the No of Elements to Input");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Numbers to Store it in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the No of Splits");
        int m = scn.nextInt();
        int ans = splitTheArray(arr, m);
        System.out.println(ans);
    }

    static int splitTheArray(int[] arr, int m) {
        int max = 0;
        int sum = 0;
        for (int val : arr) {
            sum += val;
            max = Math.max(val, max);
        }
        if (m == arr.length) {
            return max;
        }
        int lo = max;
        int hi = sum;
        int ans = 0;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(arr, mid, m) == true) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    static boolean isPossible (int[] arr, int mid, int m) {
        int sa = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > mid) {
                sa++;
                sum = arr[i];
            }
        }
        return sa <= m;
    }
    }
