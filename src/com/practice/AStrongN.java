package com.practice;

public class AStrongN {
    public static void main(String[] args) {

        int num = 1853;
        boolean result = isArmStrongNum(num);
        System.out.println(result);

    }
    public static boolean isArmStrongNum(int num){
        int temp = num;
        String s = String.valueOf(num);
        int power = s.length();

        int sum = 0;

        while (num >0){
            int digit = num % 10;
            sum = (int) (sum + Math.pow(digit,power));
            num = num / 10;
        }
        if (sum == temp){
            return true;
        }
        return false;
    }

}