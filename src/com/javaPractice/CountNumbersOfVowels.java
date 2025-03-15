package com.javaPractice;

public class CountNumbersOfVowels {
    public static void main(String[] args) {
        String s = "aeiou";

        int n = s.length();
        int count = 0;
        for(int i = 0; i<n; i++){
           char ch =  s.charAt(i);
           boolean result = isVowel(ch);

           if(result){
               count++;
           }
        }
        System.out.println(count);

    }
    public static boolean isVowel(char ch){
        String vowel = "aeiouAEIOU";

        int index = vowel.indexOf(ch);
        if(index >= 0){
            return true;
        }
        return false;
    }
}
