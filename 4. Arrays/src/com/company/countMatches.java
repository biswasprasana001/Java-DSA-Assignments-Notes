package com.company;

import java.util.ArrayList;
import java.util.List;

public class countMatches {
    public static void main(String[] args) {
        String[][] items = {{"phone","blue","pixel"},{"computer","silver","phone"},{"phone","gold","iphone"}};
        String ruleKey = "type";
        String ruleValue = "phone";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
    static int countMatches(String[][] items, String ruleKey, String ruleValue) {
        int count = 0;
        if (ruleKey == "type") {
            for (int i = 0; i < items.length; i++) {
                if(items[i][0] == ruleValue) {
                    count++;
                }
            }
        }if (ruleKey == "color") {
            for (int i = 0; i < items.length; i++) {
                if(items[i][1] == ruleValue) {
                    count++;
                }
            }
        }if (ruleKey == "name") {
            for (int i = 0; i < items.length; i++) {
                if(items[i][2] == ruleValue) {
                    count++;
                }
            }
        }
        return count;
    }
}
