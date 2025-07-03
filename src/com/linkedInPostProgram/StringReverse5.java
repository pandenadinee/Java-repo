package com.linkedInPostProgram;

public class StringReverse5 {
    public static void main(String[] args) {
        String s = "RACECAR";
        System.out.println(reverse(s));

    }
    public static String reverse(String s){
        char[] arr = s.toCharArray();
        int n =arr.length;
       int left = 0;
       int right = n-1;
       while (left < right){
           char temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           left ++;
           right --;
       }
       String result = String.valueOf(arr);
       return result;
    }
}
