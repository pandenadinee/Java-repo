package com.linkedInPostProgram;

import com.javaPractice.Pnumber;

import java.util.Enumeration;

public class NumberReverseProgram {
    public static void main(String[] args) {
        int num = -12345;
        System.out.println(reverse(num));
    }
    public static int reverse(int num){
        int temp = num;
        int sign = 1;
        if (num < 0){
            sign = -1;
        }
        num = Math.abs(num);

        int sum = 0;
        while (num >0){
            int reminder = num % 10;
            sum =( sum *10) + reminder;
            num = num / 10;
        }
//        System.out.println(sum);
        return sum * sign;
    }
}
