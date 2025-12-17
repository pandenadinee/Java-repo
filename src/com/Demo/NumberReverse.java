package com.Demo;

public class NumberReverse{
    public static void main(String[] args) {
        int num = 123;
        reverse(num);

    }
    public static void reverse(int num){
        int sum = 0;
        while (num > 0){
            int reminder = num % 10;
            sum =( sum * 10) + reminder;
            num = num /10;
        }
        System.out.println(sum);
    }
}
