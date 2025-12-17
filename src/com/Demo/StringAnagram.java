package com.Demo;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String s1 = "Life";
        String s2 = "File" ;
        boolean result = isAnagram(s1 ,s2);
        System.out.println(result);


    }
    public static boolean isAnagram(String s1 , String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 != n2){
            return false;
        }
        String s3 = s1.toLowerCase();
        char[] ch1 = s3.toCharArray();
        int m = ch1.length;
        Arrays.sort(ch1);

        String s4 = s2.toLowerCase();
        char[] ch2 = s4.toCharArray();
        Arrays.sort(ch2);

        for (int i = 0; i<m; i++){
            if (ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }

}
