package com.javaPractice;

public class StringD {
    public static void main(String[] args) {
        String s = "MalayalaM";
//        firstString(s);
//        secondString(s);
        CheckPallindrome(s);
    }
    public static void firstString(String s ){
        int n = s.length();
        String result = " ";
        for(int i =n-1; i>=0; i--){
            result = result+s.charAt(i);
        }
        System.out.println(result);
    }
    public static void secondString(String s){
        int n = s.length();
        char[] s1 = s.toCharArray();
        String result = " ";

        for(int i =n-1; i>=0; i--){
            result = result+s1[i];
        }
        System.out.println(result);
    }
    public static void CheckPallindrome(String s){
        int n = s.length();
        boolean value = true;
        int first = 0;
        int last = n-1;
        while (first < last){
            char f = s.charAt(first);
            char l = s.charAt(last);
            if(f != l){
                value = false;
                break;
            }
            first++;
            last--;
        }
        if(value==true){

            System.out.println("this is pallindrome");
        }
        else {
            System.out.println("this is not pallindrome");
        }

    }

}
