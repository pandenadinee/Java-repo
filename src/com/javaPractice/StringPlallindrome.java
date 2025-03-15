package com.javaPractice;

public class StringPlallindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        int n = s.length();

        int left = 0;
        int right = n-1;
        while(left < right){
            char l =s.charAt(left);
            char r =s.charAt(right);
            if(l!=r){
                System.out.println("s is not pallindrome");
                return;
            }

            left++;
            right--;

        }


    }
}
