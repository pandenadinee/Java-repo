package com.Demo;

public class PrimeNumber {
    public static void main(String[] args) {
        for(int num = 1 ; num <= 100; num++){
            if (isPrime(num)){
                System.out.println(num);
            }

        }
    }
    public static  boolean isPrime(int num){
        if (num < 2){
            return false;
        }

        for(int i= 3; i<= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;

    }
}
