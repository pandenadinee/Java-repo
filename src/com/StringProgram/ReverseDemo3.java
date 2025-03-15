package com.StringProgram;

public class ReverseDemo3 {
    public static void main(String[] args) {
        String s = "hi i am nandini uday pandey";
        String[] arr = s.split(" ");
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i>=0; i--){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
        String s2 = sb.toString();
        String[] arr2 = s2.split(" ");
        String result = " ";

        int n2 = arr2.length;
        for (int j = 0; j<n2; j++){
            String word = arr2[j];
            result = result +reverse(word)+" ";

        }
        result = result.trim();
        System.out.println(result);
    }
    public static String reverse(String word){
        StringBuilder sb = new StringBuilder();
        int n = word.length();
        for(int k = n-1; k>=0; k--){
            sb.append(word.charAt(k));
        }
        String send = sb.toString();
        return send;
    }
}
