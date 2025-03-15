package com.javaPractice;

public class PrimeNo {
    public static void main(String[] args) {
        int start = 0;
        int end = 100;
        for(int i = start; i<=end; i++){
            boolean prime = isPrime(i);
            if(prime ) System.out.println(i);
        }

    }
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i =2; i < num - 1; i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
}
