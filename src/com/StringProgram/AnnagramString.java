package com.StringProgram;

import java.util.Arrays;

public class AnnagramString{
    public static void main(String[] args) {
        String s1 = "wo";
        String s2 = "Cow";
        System.out.println(isAnngram(s1, s2));


    }
    public static boolean isAnngram(String s1 , String s2){
        if(s1.length() != s2.length()){

            return false;
        }
       s1= s1.toLowerCase();
       s2=  s2.toLowerCase();

        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        int n = ch1.length;

        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch2);
        int n2 = ch2.length;

        for(int i = 0; i<n; i++){
            if (ch1[i] != ch2[i]){
                return  false;
            }
        }
        return true;
    }

}
