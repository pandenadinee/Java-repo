package com.program;

public class StringVowelReverse {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
//
        char[] ch = s.toCharArray();
        int n = ch.length;
        int left = 0;
        int right = n-1;
        while (left<right){
            if (isVowel(ch[left]) && isVowel(ch[right])){
                char temp = ch[left];
                ch[left]  = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            else if (isVowel(ch[left]) == false){
                left++;
            }
            else if (isVowel(ch[right]) == false){
                right--;
            }
        }
        String reverseString = String.valueOf(ch);
        System.out.println(reverseString);

    }
    public static boolean isVowel(char ch){
        String vowel = "aeiouAEIOU";
        int value = vowel.indexOf(ch);
        if (value >= 0){
            return true;
        }
        return false;
    }
}
