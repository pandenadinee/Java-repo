package com.linkedInPostProgram;

public class PrimeNo {
    public static void main(String[] args) {
        int num = 33;
        boolean result = isPrime(num);
        System.out.println(result);
    }
    public static boolean isPrime(int num){
        if (num < 2){
            return false;
        }
        for (int i = 2; i<=num-1; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

}
