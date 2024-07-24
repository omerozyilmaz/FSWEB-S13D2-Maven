package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int num) {
        int number = Math.abs(num);
        char[] nums = String.valueOf(number).toCharArray();
        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] != nums[nums.length - (i + 1)]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectNumber(int number) {
        int result = 0;
        if (number < 0) {
            return false;
        }
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        return result == number;
    }

    public static String numberToWords(int numb) {
        if (numb < 0) {
            return "Invalid Value";
        }

        String[] onedigit = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder word = new StringBuilder();

        for (char digit : String.valueOf(numb).toCharArray()) {
            word.append(onedigit[Character.getNumericValue(digit)]).append(" ");
        }

        return word.toString().trim();
    }
}