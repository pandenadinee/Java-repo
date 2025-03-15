package com.javaPractice;

public class Demo2 {
    public static void main(String[] args) {
        int num = 3456;
        int reminder = 0;
        int sum = 0;


        while (num != 0) {
            reminder = num % 10;
            sum = sum * 10 + reminder;
            num = num / 10;

        }
        System.out.println(sum);
        if (sum == num) {
            System.out.println("num is pllindrome no");

        } else {
            System.out.println("num is not pallindrome no");
        }
    }
}














