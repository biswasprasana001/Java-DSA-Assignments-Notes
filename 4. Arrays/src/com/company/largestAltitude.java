package com.company;

import java.util.Arrays;

public class largestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        largestAltitude(gain);
    }
     static int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length + 1];
        for(int i = 0; i < alt.length; i++) {
            if(i == 0) {
                alt[i] = 0;
            }
            else {
                alt[i] = alt[i-1] + gain[i-1];
            }
        }
         System.out.println(Arrays.toString(alt));
        int maxAlt = alt[0];
        for (int i = 1; i < alt.length; i++) {
            if(maxAlt < alt[i]) {
                maxAlt = alt[i];
            }
        }
         System.out.println(maxAlt);
        return maxAlt;
     }
}
