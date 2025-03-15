package com.javaPractice;

import java.util.Enumeration;

public class Pnumber {
    public static void main(String[] args) {
//        int num = 13;

        for(int i = 0; i<=100; i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }


    }
    public static boolean isPrime(int num){
        if(num < 2){
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
