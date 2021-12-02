package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEncodingString("aabbbc"));
    }

    public static String getEncodingString(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] != chars[i + 1]) {
                stringBuilder.append(i + count);
                stringBuilder.append(chars[i]);
                count = i;
            }
        }
        return stringBuilder.toString();
    }
}
