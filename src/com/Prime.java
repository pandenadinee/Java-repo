package com;

public class Prime {
    public static void main(String[] args) {
//       int num = 13;
        for(int i = 2 ; i<=50; i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
//        System.out.println(isPrime(num));

    }
    public static boolean isPrime(int num ){
        if(num < 2){
            return false;
        }
        for(int i = 2; i<num-1; i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
}
