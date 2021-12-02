package com.company.problem1;

/**
 * @author Arman Karapetyan
 */

public class Main {
    public static void main(String[] args) {
        char char1 = getNotRepeatChapter("abacabad");
        char char2 = getNotRepeatChapter("abacabaabacaba");
        char char3 = getNotRepeatChapter("");
        System.out.println(char3);
        System.out.println(char1);
        System.out.println(char2);
    }

    public static char getNotRepeatChapter(String word) {
        if (word == null) {
            return '_';
        }
        char[] chars = word.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j] && i != j) {
                    count++;
                }
            }
            if (count == 0) {
                return chars[i];
            }
            count = 0;
        }
        return '_';
    }
}
