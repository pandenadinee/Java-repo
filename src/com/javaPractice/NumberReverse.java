package com.javaPractice;

public class NumberReverse {
    public static void main(String[] args) {
        int number = 4004;
        int sum = 0;
        int temp = number;
        while (number!=0){
            int reminder = number%10;
            sum = (sum*10) + reminder;
            number = number/10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("this is pallindrome");
        }
        else {
            System.out.println("this is not pallindrome");
        }

    }
}
