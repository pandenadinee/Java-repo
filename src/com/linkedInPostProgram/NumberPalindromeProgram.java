package com.linkedInPostProgram;

public class NumberPalindromeProgram {
    public static void main(String[] args) {
        int num = -1001;
        boolean result = isPalindrome(num);
        System.out.println(result);

    }
    public static boolean isPalindrome(int num){
        int temp = num;
        if (num < 0){
            return false;
        }
        int sum = 0;
        while (num >0){
            int reminder  = num % 10;
            sum = (sum * 10) + reminder;
            num = num / 10;
        }
        if (sum == temp){
            return true;
        }
        return false;
    }
}
