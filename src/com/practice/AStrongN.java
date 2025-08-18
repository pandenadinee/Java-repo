package com.practice;

public class AStrongN {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmStrong(num));

    }

    public static boolean isArmStrong(int num) {
        int temp = num;
        String s = String.valueOf(num);
        int power = s.length();

        int sum = 0;
        while (num > 0) {
            int length = num % 10;
            sum = sum +powe(length,power);
            num = num / 10;
        }
        if (sum == temp) {
            return true;
        }
        return false;
    }

    public static int powe(int length , int power) {

        int sum = 1;
        for (int i = 1; i <= power; i++) {
            sum = sum * length;
        }
        return sum;

    }
}