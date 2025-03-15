package com.javaPractice;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String s = "aarushi";
        char[] ch = s.toCharArray();
        int n = s.length();

        int i = 0;
        int j = n-1;
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(ch));
        String ans = String.valueOf(ch);
        System.out.println(ans);


    }
}
