package com.dmdev.oop.taskStrings;

public class StringTask {
    public static void main(String[] args) {
    }

    private static boolean isPalindrome(String value) {
        String ignoreCase = value.toLowerCase();
        String reverseString = String.valueOf(new StringBuilder(ignoreCase).reverse());
        return ignoreCase.equals(reverseString);
    }
}
