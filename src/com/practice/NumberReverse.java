package com.practice;

public class NumberReverse {
    public static void main(String[] args) {
        int num = 1231;
        reverse(num);

    }
    public static int reverse(int num){
        int temp = num;
        int sum = 0;
        while (num > 0){
            int reminder = num % 10;
            sum = (sum * 10) + reminder;
            num = num / 10;

        }
        System.out.println(sum);
        return sum;
    }
}
