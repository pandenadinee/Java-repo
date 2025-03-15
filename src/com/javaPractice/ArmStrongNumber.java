package com.javaPractice;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmStong(num));

    }
    public static boolean isArmStong(int num) {
        int temp = num;
        String s = new String(String.valueOf(num));
        int n = s.length();
        int sum = 0;
        while (num > 0){
            int power = num % 10;
            sum = (int) (sum + Math.pow(power,n));
            num = num /10;

        }
        if (sum == temp ){
            return true;
        }
        return false;
    }

}
