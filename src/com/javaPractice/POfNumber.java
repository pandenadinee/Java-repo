package com.javaPractice;

public class POfNumber {
    public static void main(String[] args) {
        int power = 4;
        int num = 2;
        int result = powerofNo(power,num);
        System.out.println(result);

    }
    public static int powerofNo(int power , int num){
        int sum = 1;
        for(int i = 1; i<=power; i++){
            sum = sum *num;
        }
        return sum;
    }
}
