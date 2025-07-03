package com.linkedInPostProgram;

public class StringReverse2{
    public static void main(String[] args) {
        String s = "hi my name is nandini";
        System.out.println("Reverse String is : "+reverse(s));
    }
    public static String reverse(String s){
        char[] arr = s.toCharArray();
        int n  = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i>=0; i--){
            sb.append(arr[i]);
        }
        String result = sb.toString();
        return result;
    }
}
