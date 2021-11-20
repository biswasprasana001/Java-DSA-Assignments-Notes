package com.company;

import java.util.Arrays;

public class flipAndInvertImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        flipAndInvertImage(image);
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int[][] revImage = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            for(int j = 0; j < image[i].length; j++) {
                revImage[i][j] = image[i][(image.length - 1) - j];
            }
        }

        for (int i = 0; i < revImage.length; i++) {
            for (int j = 0; j < revImage[i].length; j++) {
                if(revImage[i][j] == 1) {
                    revImage[i][j] = 0;
                } else {
                    revImage[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < revImage.length; i++) {
            System.out.println(Arrays.toString(revImage[i]));
        }
        return revImage;
    }
}
