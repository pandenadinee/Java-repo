package com.javaPractice;

public class SumOfDigitNumber {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while (num>0){
            int rem = num % 10;
            sum = sum +rem;
            num = num/10;

        }
        System.out.println(sum);
    }
}
