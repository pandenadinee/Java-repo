package com.program;

public class Factor {
    public static void main(String[] args) {
        int num = 10;
        int result = factorial(num);
        System.out.println("factor of num is :" + result);

    }

    public static int factorial(int num) {
        int product = 1;
        for (int i = 1; i <= num; i++) {
            product = product * i;
        }
        return product;
    }
}
