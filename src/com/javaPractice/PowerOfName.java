package com.javaPractice;

public class PowerOfName {
    public static void main(String[] args) {
        int num = 4;
        int power = 4;
        System.out.println(Power(num, power));

    }
    public static int Power(int num , int power){
        int sum = 1;
        for(int i = 1; i<=power; i++){
            sum = sum * num;

        }
        return sum;
    }
}
