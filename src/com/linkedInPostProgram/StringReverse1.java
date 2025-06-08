package com.linkedInPostProgram;

public class StringReverse1 {
    public static void main(String[] args) {
        String s = "nandini";
        System.out.println(reverse(s));

    }
    public static String reverse(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        String result = sb.toString();
        return result;
    }
}
