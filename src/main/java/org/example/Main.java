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

    public static String numberToWords(int num) {
        if (num < 0)
            return "Invalid Value";


        char[] digits = String.valueOf(num).toCharArray();
        String numToText="";
        for (char digit: digits) {
            switch (digit) {
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;
                default:
                    break;
            }
        }
        return numToText.trim();
    }

}