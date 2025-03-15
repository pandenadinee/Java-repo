package com.StringProgram;

public class ReverseDemo1 {
    public static void main(String[] args) {
        String s = "hi i am nandini uday pandey";
        String[] arr = s.split(" ");
        int n = arr.length;

        StringBuilder sb  = new StringBuilder();
        for(int i = n-1; i>=0; i--){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
