package com.Demo;

public class FactorialDemo {
    public static void main(String[] args) {
        int num = 5;
        factor(num);
    }
    public static void factor(int num){
        int sum = 1;
        for (int i = 1; i<= num; i++){
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
