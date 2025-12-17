package com.Demo;

public class StingDemo1 {
    public static void main(String[] args) {
        String s = "nandini";
        reverse(s);
    }
    public static String reverse(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i>=0; i--){
            sb.append(s.charAt(i));

        }

        String result = sb.toString();
        System.out.println(result);

        return result;
    }
}
