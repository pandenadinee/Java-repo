package com.program;

public class Factorial {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(factor(num));

    }

    public static int factor(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }
        return sum;
    }
}
