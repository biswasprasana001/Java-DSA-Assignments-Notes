package com.company;

public class checkIfPangram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        int count = 0;
        for(char i = 'a'; i <= 'z'; i++) {
            for(int j = 0; j < sentence.length(); j++) {
               if(i == sentence.charAt(j)) {
                   count++;
               }
            }
        }
        if(count >= 26) {
            return true;
        }
        else {
            return false;
        }
    }
}


