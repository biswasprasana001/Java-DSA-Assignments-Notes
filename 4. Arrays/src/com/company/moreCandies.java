package com.company;

import java.util.Arrays;
import java.util.List;

public class moreCandies {
    public static <Ans> void main(String[] args) {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        System.out.println(Arrays.toString(kidsWithCandies(candies, extraCandies)));
    }
    static Boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        Boolean[] result = new Boolean[candies.length];
        for(int i = 0; i < candies.length; i++) {
            candies[i] += extraCandies;
            int max = 0;
            for(int j = 0; j < candies.length; j++) {
                if (max < candies[j]) {
                    max = candies[j];
                }
            }
            if (max == candies[i]) {
                result[i] = true;
            }
            else {
                result[i] = false;
            }
            candies[i] -= extraCandies;
        }
        return result;
    }
}
