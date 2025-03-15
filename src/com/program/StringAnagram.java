package com.program;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String s1 = "Life";
        String s2 = "File";
        boolean result = isAnagram(s1, s2);
        System.out.println(result);
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 = s1.toLowerCase();
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        int n = arr1.length;

        s2 = s2.toLowerCase();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr2);

       for(int i = 0; i<n; i++){
           if (arr1[i] != arr2[i]){
               return false;
           }
       }
       return true;
    }
}
