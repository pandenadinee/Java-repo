package com.javaPractice;

public class Power {
    public static void main(String[] args) {
        int length = 4;
        int power = 5;

        int sum = 1;
        for(int i = 1; i<=length; i++){
            sum = sum * power;
        }
        System.out.println(sum);

    }
}
