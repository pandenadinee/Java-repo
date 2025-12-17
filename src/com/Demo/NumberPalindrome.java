package com.Demo;

public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 121;
       boolean result =  isPalindrome(num);
        System.out.println(result);
    }
    public static boolean isPalindrome(int num){
        int sum = 0;
        int temp = num;

        while (num > 0){
            int reminder =  num % 10;
            sum = (sum * 10) + reminder;
            num = num / 10;

        }
        if (sum == temp){
            return true;
        }
        else return false;
    }
}
