package com.StringProgram;

public class StringReverse1 {
    public static void main(String[] args) {
        String s = "this is my first string program";
        char[] arr = s.toCharArray();
        int n = arr.length;

        StringBuilder sb = new StringBuilder(n);
        for(int i = n-1; i>=0; i--){
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
