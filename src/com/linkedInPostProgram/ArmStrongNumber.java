package com.linkedInPostProgram;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int number = 1523;
        boolean result = isArmStrong(number);
        System.out.println(result);


    }
    public static boolean isArmStrong(int number){
        int temp = number;
        String s = String.valueOf(number);
        int power = s.length();

        int sum = 0;
        while (number >0){
            int length = number % 10;
            sum = (int) (sum + Math.pow(length,power));
            number = number /10;

        }
        if (sum == temp){
            return true;
        }
        return false;

    }
}
