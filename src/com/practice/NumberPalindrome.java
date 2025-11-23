package com.practice;

public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 121;
        boolean result = palindrome(num);
        System.out.println(result);

    }
    public static boolean palindrome(int num){
        int temp = num;
        int sum = 0;
        while(num > 0){
            int reminder = num % 10;
            sum = (sum * 10) + reminder;
            num = num /10;

        }
        if (sum == temp){
            return true;
        }
        return false;
    }
}
