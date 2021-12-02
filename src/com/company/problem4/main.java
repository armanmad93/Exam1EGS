package com.company.problem4;

/**
 * @author Arman Karapetyan
 */

public class main {
    public static void main(String[] args) {
        getEncodingDefined("aabbbc");
    }

    public static String getEncodingDefined(String word) {
        char[] chars = word.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length() - 1; i++) {
            if (chars[i] != chars[i + 1]) {
                stringBuilder.insert(0, i);
            }
        }

        System.out.println(stringBuilder);
        return null;
    }


}
