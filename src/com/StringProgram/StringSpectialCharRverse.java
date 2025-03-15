package com.StringProgram;

import static java.lang.Character.isAlphabetic;

public class StringSpectialCharRverse {
    public static void main(String[] args) {
        String s = "a.bc@gmail.com";
       String reve =  reverse(s);
        System.out.println(reve);


    }
    public static String reverse(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;
        int  left = 0;
        int right = n-1;
        while (left<=right){
            if (Character.isLetter(arr[left]) &&  Character.isLetter(arr[right])){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(Character.isLetter(arr[left]) == false ){
                left++;
            }
            else if( Character.isLetter(arr[right]) == false){
                right--;
            }

        }

        String s1 = String.valueOf(arr);
        return s1;


    }


}
