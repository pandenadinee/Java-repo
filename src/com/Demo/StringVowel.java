package com.Demo;

public class StringVowel {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";

        char[] ch = s.toCharArray();
        int n = ch.length;

        int left = 0;
        int right  = n-1;
         while (left < right){
             if (isVowel(ch[left]) && isVowel(ch[right]) == true){
                 char temp = ch[left];
                 ch[left] = ch[right];
                 ch[right] = temp;
                 left++;
                 right--;
             }
             else if (isVowel(ch[left]) == false){
                 left ++;
             }
             else if (isVowel(ch[right]) == false){
                 right --;
             }
         }
         String result = String.valueOf(ch);
        System.out.println(result);

    }
    public static boolean isVowel(char letter){

        String vowel = "aeiou";
        return vowel.indexOf(letter) >= 0;


    }
}
