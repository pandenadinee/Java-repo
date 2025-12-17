package com.Demo;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmStrong(num));

    }
    public static boolean isArmStrong(int num){
        int temp = num;
        String s = String.valueOf(num);
        int  power = s.length();

        int sum = 0;
        while (num > 0){
            int length = num % 10;
            sum = (int) (sum + Math.pow(length ,power));
            num = num /10;
        }
        if (sum == temp){
            return true;
        }
        else return false;
    }
}
