package com.linkedInPostProgram;

public class StringReverse4 {
    public static void main(String[] args) {
        String s = "hi my name is nandini";
        String[] arr = s.split(" ");
        int n = arr.length;
        String result = " ";
        for (int i = 0; i < n; i++) {
            String word = arr[i];
            result = result + reverse(word) + " ";
        }
        result = result.trim();
        System.out.println(result);
    }

    public static String reverse(String word) {
        char[] arr = word.toCharArray();
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        String reverseWord = sb.toString();
        return reverseWord;
    }
}
