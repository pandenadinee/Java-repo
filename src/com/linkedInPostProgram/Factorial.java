package com.linkedInPostProgram;

public class Factorial {
    public static void main(String[] args) {
        int num = 10;
        int result = factorial(num);
        System.out.println(result);
    }
    public static int factorial(int num){
        int sum = 1;
        for (int i = 1; i<=10; i++){
            sum = sum * i;
        }
        return sum;
    }
}
