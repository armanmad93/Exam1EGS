package com.company.problem3;

import java.util.Arrays;

/**
 * @author Arman Karapetyan
 */

public class main {
    public static void main(String[] args) {
        System.out.println(getMaximalNumber(152));
        System.out.println(getMaximalNumber(1001));
    }

    public static int getMaximalNumber(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        int finallyNumber = 0;
        while (number != 0) {
            stringBuilder.insert(0, number % 10);
            number /= 10;
        }

        int[] numbers = new int[stringBuilder.length()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Character.getNumericValue(stringBuilder.charAt(i));
        }

        int minimalNumber = numbers[0];
        int count = 0;
        boolean term = true;
        for (int i = 0; i < numbers.length; i++) {
            if (minimalNumber > numbers[i]) {
                minimalNumber = numbers[i];
            }
        }

        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i] != minimalNumber) {
                finallyNumber += numbers[i] * Math.pow(10, count);
                count++;
            }
        }

        return finallyNumber;
    }
}
