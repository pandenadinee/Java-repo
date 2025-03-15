package com.program;

import java.util.HashMap;

public class StringReverse {
    public static void main(String[] args) {
        String s = "nandini";

//        System.out.println(reverse(s));
//        System.out.println(reverse1(s));
        System.out.println(reverse3(s));

    }
    public static String reverse(String s){
        int n = s.length();
        String result = "" ;
        for(int i = n-1; i>=0; i--){
            result = result +s.charAt(i);

        }

        return result;
    }
    public static String reverse1(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int i = 0;
        int j = n-1;
        while (i<j){
            char temp = arr[i];
            arr[i]   = arr[j];
            arr[j]   = temp;
            i++;
            j--;
        }
       return String.valueOf(arr);
    }
    public static String reverse3(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = n-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        String result = sb.toString();
        return result;
    }
}
