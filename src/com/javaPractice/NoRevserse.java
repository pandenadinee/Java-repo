package com.javaPractice;

public class NoRevserse {
    public static void main(String[] args) {
        int num = 121;
        revers(num);

    }
    public static void revers(int num){
        int temp  = num;
        int sum = 0;
        while (num>0){
            int rem = num % 10;
            sum = (sum *10)+rem;
            num = num / 10;
        }
        System.out.println(sum);
        if(sum == temp){
            System.out.println("is pallindrome");
        }
        else {
            System.out.println("not pallindrome");
        }
    }
}
