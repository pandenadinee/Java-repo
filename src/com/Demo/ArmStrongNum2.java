package com.Demo;

public class ArmStrongNum2 {
    public static void main(String[] args) {

        for (int num =1; num<=500; num++){

            if (isArmStrongNumber(num) == true){
                System.out.println(num);
            }
        }
    }
    public static boolean isArmStrongNumber(int num){

        int temp = num;
        String s = String.valueOf(num);
        int power = s.length();
        int sum = 0;
        while(num > 0){
            int length = num % 10;
            sum = (int) (sum + Math.pow(length , power));
            num = num /10;
        }
        if (sum == temp ){
            return true;
        }
         return false;
    }
}
