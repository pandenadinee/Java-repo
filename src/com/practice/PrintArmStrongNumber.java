package com.practice;

public class PrintArmStrongNumber {
    public static void main(String[] args) {
        int num = 1000;
        for (int i =1; i<=num; i++){
            if (isArmStrongNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isArmStrongNumber(int num ){
        int temp = num;
        int power = String.valueOf(num).length();

        int sum = 0;
        while (num >0){
            int digit = num %10;
            sum = (int) (sum + Math.pow(digit , power));
            num = num /10;
        }
        if (sum == temp){
            return true;
        }
        else return false;

    }
}
