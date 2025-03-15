package com.StringProgram;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class StringAnagramDemo {
    public static void main(String[] args) {
        String s1 = "RACECAR";
        String s2 = "ComeWel";

//        System.out.println(isAnnagram(s1, s2));

        System.out.println(isPallindrome(s1));
    }

    public static boolean isAnnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 = s1.toLowerCase();
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        int n1 = ch1.length;

        s2 = s2.toLowerCase();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch2);
        int n2 = ch2.length;

        for (int i = 0; i < n1; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;

    }

    public static boolean isPallindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left<right){
            if(arr[left]!=arr[right]){
                System.out.println("it is not pallindrome");
                return false;
            }
            left++;
            right--;
        }
        System.out.println("it is pallidrome");
        return true;
    }
}