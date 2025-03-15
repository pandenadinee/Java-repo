package com.javaPractice;

public class PrimeNumber2 {
    public static void main(String[] args) {

        for(int num = 2 ; num<=1000; num++) {
            if (isPrime(num)) {
                System.out.print(num+" ");

            }
        }
    }
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
