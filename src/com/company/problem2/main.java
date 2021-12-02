package com.company.problem2;

/**
 * @author Arman Karapetyan
 */

public class main {
    public static void main(String[] args) {
        System.out.println(getReverseOrderBitsNumber(97));
        System.out.println(getReverseOrderBitsNumber(8));
    }

    public static int getReverseOrderBitsNumber(int number) {
        return getNumber(getReverseBinary(number));
    }

    public static String getReverseBinary(int number) {

        StringBuilder stringBuilder = new StringBuilder();

        while (number != 0) {
            stringBuilder.append(number % 2 == 0 ? "0" : "1");
            number /= 2;
        }
        return stringBuilder.toString();
    }

    public static int getNumber(String binary) {
        char[] chars = binary.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                count += Math.pow(2, chars.length - i);
            }
        }
        return count / 2;
    }

}
