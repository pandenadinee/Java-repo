package com.program;

public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 131;
        System.out.println(isPalindrome(num));

    }
    public static boolean isPalindrome(int num){
        int temp = num;
        int sum = 0;
        while (num > 0){
            int reminder  = num % 10;
            sum = (sum * 10) + reminder;
            num = num / 10;

        }
        if (sum == temp){
            System.out.println("number is palindrome");
            return true;
        }
        else {
            System.out.println("number is not palindrome");
            return false;
        }
    }
}
