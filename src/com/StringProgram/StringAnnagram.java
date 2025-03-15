package com.StringProgram;

import java.util.Arrays;

public class StringAnnagram {
    public static void main(String[] args) {
        String s1 = "Dad";
        String s2 = "Add";
       boolean result = isAnngram(s1,s2);
        System.out.println(result);


    }
    public static boolean isAnngram(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        s1 = s1.toLowerCase();
        char[] arr1 =s1.toCharArray();
        Arrays.sort(arr1);
        int n1 = arr1.length;

        s2 = s2.toLowerCase();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr2);

//       boolean check =  Arrays.equals(arr1,arr2);

         s1=String.valueOf(arr1);

         s2 = String.valueOf(arr2);

        return s1.equals(s2);

//        for(int i =0; i<n1; i++){
//            if(arr1[i] != arr2[i]){
//                return false;
//            }
//        }
//        return true;
//        return check;
    }
}
