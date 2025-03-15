package com.javaPractice;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String s = "aparajita";
        StringBuilder sb = new StringBuilder(); // ""
        int n = s.length();
        for(int i = n-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        System.out.println(sb);


    }
}
