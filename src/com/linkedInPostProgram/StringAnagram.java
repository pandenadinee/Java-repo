package com.linkedInPostProgram;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String s1 = "Life";
        String s2 = "File";
        boolean result = isAnagram(s1, s2);
        System.out.println(result);
    }
    public static boolean isAnagram(String s1 , String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 != n2){
            return false;
        }
        s1 = s1.toLowerCase();
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        int n3 = ch1.length;

        s2 = s2.toLowerCase();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch2);
        int n4= ch2.length;

        for (int i = 0; i<n3; i++){
            if (ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }
}
