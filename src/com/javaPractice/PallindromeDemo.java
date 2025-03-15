package com.javaPractice;



public class PallindromeDemo {
    public static void main(String[] args) {
        int num = 222;
//        isNumberPallindrome(num);

        String s = "RACECAR";
        isStringPallindrome(s);

    }
    public static boolean isNumberPallindrome(int num){
        int temp = num;
        int sum = 0;
        while (num>0){
            int rem = num % 10;
            sum = (sum *10) + rem;
            num = num/10;

        }
        System.out.println(sum);
        if(sum == temp){

            System.out.println("is pallindrome");
            return true;
        }
        else {
            System.out.println("is not pallindrome");
            return false;
        }
    }
    public static void isStringPallindrome(String s){
        int n = s.length();
        boolean b = true;

        int left = 0;
        int right = n-1;
        while (left<right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(l != r){
                b = false;
                break;
            }
            left++;
            right--;

            }
        System.out.println(s);
        if(b == true){
            System.out.println("String is pallindrome");

        }
       else {
            System.out.println("string is not pallindrome");
        }
    }
}
