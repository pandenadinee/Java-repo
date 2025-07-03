package com.linkedInPostProgram;

public class StringReverse3 {
    public static void main(String[] args) {
        String s = "hi my name is nandini";
        System.out.println(reverse(s));

    }
    public static String reverse(String s){
        String[] arr = s.split(" ");
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i>=0; i--){
            sb.append(arr[i]).append(" ");
        }
        String result = sb.toString();
        return result;
    }

}
