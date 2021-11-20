package com.company;

import java.util.Arrays;

public class aryfrmPermu {

    public static void main(String[] args) {
        int[] numbs = {0, 2, 1, 5, 3, 4};
        buildArray(numbs);
    }
    public static int[] buildArray(int[] numbs) {
        int[] ans = new int[numbs.length];
        for(int i = 0; i < numbs.length; i++) {
            ans[i] = numbs[numbs[i]];
        }
        return ans;
    }
    }

