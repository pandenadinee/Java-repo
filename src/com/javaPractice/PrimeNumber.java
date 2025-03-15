package com.javaPractice;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 32;
        boolean prime = isPrime(num);
        System.out.println(prime);
    }
    public static boolean isPrime(int num ){
            if(num<2){
                return false;
            }
        for(int i = 2; i*i<=num; i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }


}
