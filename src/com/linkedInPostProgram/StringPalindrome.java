package com.linkedInPostProgram;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "RACECAR";
        boolean result = isPalindrome(s);
        System.out.println(result);

    }
    public static boolean isPalindrome(String s){
            int n = s.length();
            int left = 0;
            int right = n-1;
            while (left < right){
                char ch1 = s.charAt(left);
                char ch2 = s.charAt(right);
                if (ch1 != ch2){
                    return false;
                }
                left++;
                right--;
            }
             return true;
    }
}
