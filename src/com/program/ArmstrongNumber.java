package com.program;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        boolean result = isArmstrongNumber(num);
        System.out.println(result);
    }

    public static boolean isArmstrongNumber(int num) {
        int temp = num;
        int power = String.valueOf(num).length();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, power);

            num = num / 10;
        }
        return sum == temp;
    }
}
