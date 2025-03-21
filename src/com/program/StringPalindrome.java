package com.program;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "RACECAR";
       boolean result = isPalindrome(s);
       if (result == true){
           System.out.println("String is pallindrome : " + result);
       }
       else {
           System.out.println("String is not apllindrome : " +result);
       }
    }

    public static boolean isPalindrome(String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            char left = s.charAt(l);
            char right = s.charAt(r);
            if (left != right) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
