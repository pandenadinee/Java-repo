package com.ArrayProgram;

import java.io.FilterOutputStream;

public class PrimeNo {
    public static void main(String[] args) {
//        int num = 12;
        for (int i = 2; i<=20; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
//        boolean result = isPrime(num);
//        System.out.println(result);

    }
    public static boolean isPrime(int num){
        if (num < 2){
            return false;
        }
        for(int i = 2; i*i<num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
