package com.Demo;

public class StringConsonant {
    public static void main(String[] args) {
        String s = "abcdefghijfklmnopqrstuvwxyz";
        char[] ch = s.toCharArray();
        int n = ch.length;
        int left = 0;
        int right = n-1;
        while (left < right){
            if (isConsonant(ch[left]) && isConsonant(ch[right]) == true){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left ++;
                right --;

            }
            else if (isConsonant(ch[left]) == false){
                left ++;

            }
            else if (isConsonant(ch[right]) == false){
                right--;
            }
        }
        String result = String.valueOf(ch);
        System.out.println(result);
    }
    public static boolean isConsonant(char ch){
        String consonats = "bcdfghjklmnpqrstvwxyz";
        return consonats.indexOf(ch) >= 0;
    }
}
