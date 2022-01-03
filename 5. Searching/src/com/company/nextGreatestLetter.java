package com.company;

public class nextGreatestLetter {
    public static void main(String[] args) {

    }
    static int binarySearchAlgo(char chars[], char target) {
        int start = 0;
        int end = chars.length - 1;
        int mid = start + ((end - start)/2);
        while (start <= end) {
            if (target < chars[mid]) {
                end = mid - 1;
            } else {
                start = mid - 1;
            }
        }
        return chars[start % (chars.length)];
    }
}
