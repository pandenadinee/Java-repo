package com.Demo;

import java.util.concurrent.ScheduledFuture;

public class SpecialCharacterReverse {
    public static void main(String[] args) {
        String s = "test.@.123gmail.com";
        char[] arr = s.toCharArray();
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if (isCharacter(arr[left]) == isCharacter(arr[right]) == true){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left ++;
                right--;
            }
            else if (isCharacter(arr[left]) == false){
                left ++;
            }
            else if (isCharacter(arr[right]) == false){
                right --;
            }
        }
        String result = String.valueOf(arr);
        System.out.println(result);

    }
    public static boolean isCharacter(char ch){
        String character = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return character.indexOf(ch) >= 0;



    }
}
