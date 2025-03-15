package com.program;

public class NumberReverse {
    public static void main(String[] args) {
        int num = 12345;
         int reverseNumber = reverse(num);
        System.out.println("Reverse Number is :"+reverseNumber);
    }

    public static int reverse(int num){
        int sign = 1;
        if(num < 0){
            sign = -1;
        }
       num =  Math.abs(num);
        int sum = 0;
        while (num > 0){
            int reminder = num % 10;
             sum = (sum * 10 ) + reminder;
             num = num / 10;
        }

        return sum * sign;
    }
}


