package com.linkedInPostProgram;

public class ReverseConsonantOfString {
    public static void main(String[] args) {
        String s = "leetcode";
        char[] ch = s.toCharArray();
        int n = ch.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (isConsonant(ch[left]) && isConsonant(ch[right])) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            } else if (isConsonant(ch[left]) == false) {
                left++;
            } else if (isConsonant(ch[right]) == false) {
                right--;
            }
        }
        String result = String.valueOf(ch);
        System.out.println(result);

    }

    public static boolean isConsonant(char ch) {
        String consonant = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        int i = consonant.indexOf(ch);
        if (i >= 0) {
            return true;
        } else return false;
    }
}
