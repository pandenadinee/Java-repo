package com.javaPractice;

public class ArmStrongNumber2 {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
       for(int i = start; i<= end; i++){
           if(isArmStrongNumber(i)){
               System.out.println(i);
           }
       }

    }
    public static boolean isArmStrongNumber(int start){
        int temp = start;
        String num = new String(String.valueOf(start));
        int length = num.length();
        int sum = 0;
        while (start>0){
            int d = start % 10;
            sum = (int) (sum +Math.pow(d,length));
            start = start /10;

        }
        return sum == temp;
    }
}
