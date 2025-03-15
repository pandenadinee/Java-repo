package com.javaPractice;

public class StringDemo {
    public static void main(String[] args) {
        String s = "Nandini";
        String ans = "";
        int n = s.length();
        for(int i =n-1; i>=0; i--){
            ans = ans + s.charAt(i);
        }
        System.out.println(ans);
    }
}
