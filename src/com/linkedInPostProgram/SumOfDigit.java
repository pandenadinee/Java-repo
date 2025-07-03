package com.linkedInPostProgram;

public class SumOfDigit {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(sumOfdigits(num));
    }

    public static int sumOfdigits(int num) {
        int sum = 0;
        while (num > 0) {
            int reminder = num % 10;
            sum = sum + reminder;
            num = num / 10;
        }
        return sum;
    }
}
