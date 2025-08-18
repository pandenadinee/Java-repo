package com.practice;

public class demo1 {
    public static void main(String[] args){
        int number = 11;
        boolean result = isPrime(number);
        System.out.println(result);


    }
    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    }

