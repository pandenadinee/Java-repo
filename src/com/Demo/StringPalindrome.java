package com.Demo;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "RACECAR";

       boolean result =  isPalindrome(s);
        System.out.println(result);
    }
    public static boolean isPalindrome(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while (i<j){

            if (arr[i] != arr[j]){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
