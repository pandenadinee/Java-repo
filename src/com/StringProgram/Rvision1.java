package com.StringProgram;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Rvision1 {
    public static void main(String[] args) {
        String s = "aparajita";
//        System.out.println(reveres1(s));
//        System.out.println(revers2(s));
//        frequency(s);

        String s1 = "this is my revision practice program";
        System.out.println(rev(s1));


    }
    public static String reveres1(String s ){
        int  n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = n-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static String revers2(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;
        int  i = 0;
        int  j = n-1;
        while (i<j){
            char temp = arr[i];
            arr[i] = arr[j] ;
            arr[j]  = temp;
            i++;
            j--;
        }
        return String.valueOf(arr);
    }
    public static void frequency(String s){
        int n= s.length();
//        HashMap<Character,Integer> map = new HashMap<>();
        TreeMap<Character,Integer> map = new TreeMap<>(Comparator.naturalOrder());
        for(int i = 0; i<n; i++){
            char k = s.charAt(i);
            if(map.containsKey(k)){
                int val = map.get(k);
                map.put(k,val+1);
            }
            else{
                map.put(k,1);
            }
        }
        System.out.println(map);

    }
    public static String rev(String s1 ){
        char[] arr = s1.toCharArray();
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for(int i = n-1; i>=0; i--){
            sb.append(arr[i]);
        }
        String result = sb.toString();
        return result;
    }
}
