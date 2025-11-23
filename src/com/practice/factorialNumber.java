package com.practice;

public class factorialNumber {
    public static void main(String[] args) {
        int num = 12;
        factorial(num);
    }
    public static int factorial(int num){
        int sum = 1;
        for (int i = 1; i<=num; i++){
            sum = sum * i;
        }
        System.out.println(sum);
        return sum;
    }
}
