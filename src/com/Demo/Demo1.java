package com.Demo;

public class Demo1 {

    public static void main(String[] args) {

        int number = 10;
        System.out.println(isPrime(number));

    }
    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i <= number -1; i++){
            if (number % i== 0){
                return true;
            }
        }
        return false;
    }
}
