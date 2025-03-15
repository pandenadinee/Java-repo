package com.javaPractice;

public class ARSNo {
    public static void main(String[] args) {
        int num = 153;
       boolean result =  isArmSNo(num);
       if (result){
           System.out.println(num+ " is armsStrong");
       }
       else {
           System.out.println(num + "num is not ArmStrong");
       }

    }
    public static boolean isArmSNo(int num){
        int temp = num;
        String s = String.valueOf(num);

        int n = s.length();
        int sum =0;
        while (num>0){
            int digit = num % 10;
            sum = sum +powerofNo(n,digit);
            num = num /10;
        }
        if (sum == temp){

            return true;
        }

        return false;
    }
    public static int powerofNo(int power , int num){
        int sum = 1;
        for(int i = 1; i<=power; i++){
            sum = sum *num;
        }
        return sum;
    }
}
