package com.javaPractice;

public class NumberReverseDemo {
    public static void main(String[] args) {
        int num = 454;
        int temp = num;

        int sum = 0;
        while(num !=0){
            int reminder = num % 10;
            sum = (sum * 10)  +reminder;
            num = num/10;
        }
        System.out.println(sum);
        if (sum == temp){
            System.out.println("it is paliindrome");
        }
        else {
            System.out.println("it is not pallendrome");
        }

    }
}
