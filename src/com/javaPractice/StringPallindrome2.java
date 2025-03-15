package com.javaPractice;

public class StringPallindrome2 {
    public static void main(String[] args) {
        String s ="RACECAR";
        int n = s.length();
        boolean value = true;
        int l = 0;
        int r = n-1;
        while(l < r){
            char first = s.charAt(l);
            char last = s.charAt(r);
            if(first !=last){
                value = false;
                break;
            }
            l++;
            r--;
        }
        if (value == true){
            System.out.println("s is pallindrome");

        }
        else{
            System.out.println("s is not pallindrome");
        }
    }
}
