package com.program;

public class SumOfPowerOfNumber {
    public static void main(String[] args) {
        int number = 1234;
        int totalSum = sumOfPower(number);
        System.out.println(totalSum);
    }
    public static int sumOfPower(int number){
        int sum = 0;
        while (number > 0){
            int reminder = number % 10;
            sum = sum + reminder;
            number = number / 10;
        }
        return sum;
    }
}
