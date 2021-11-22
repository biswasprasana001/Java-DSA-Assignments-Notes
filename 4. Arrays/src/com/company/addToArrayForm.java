package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverse;

public class addToArrayForm {
    public static void main(String[] args) {
        int[] num = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int k = 1;
        addToArrayForm(num, k);
    }
    static List<Long> addToArrayForm(int[] num, int k) {
        long sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            sum *= 10;
        }
        sum = sum/10;
        sum += k;
        long rem = 0;
        ArrayList<Long> list1 = new ArrayList<>();
        while(sum > 0) {
            rem = sum%10;
            sum = sum/10;
            list1.add(rem);
        }
        ArrayList<Long> list2 = new ArrayList<>();
        for(int i = list1.size() - 1; i >= 0; i--) {
            list2.add(list1.get(i));
        }
        System.out.println(list2);
        return list2;
    }
}
