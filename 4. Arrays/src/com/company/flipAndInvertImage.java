package com.company;

import java.util.Arrays;

public class flipAndInvertImage {
    public static void main(String[] args) {
        int [][] image = {{1, 1, 0},{1, 0, 1},{0, 0, 0}};
        flipAndInvertImage(image);
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int[][] revAry = new int[image.length][];
        for(int i = 0; i < image.length; i++) {
            int [] revImage = new int[image[i].length];
            for (int j = 0; j < image[i].length; j++) {
                revImage[(image[j].length - 1) - j] = image[i][j];
            }
            revAry[i] = revImage;
        }

        return image;
    }
}
