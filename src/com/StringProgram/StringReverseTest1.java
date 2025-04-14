package com.StringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringReverseTest1 {
    public static void main(String[] args) {
        String s = "nandini";
//        reverse1(s);
//        reverse2(s);
//        reverse3(s);
        frequency(s);


    }
    public static String reverse1(String s){
        int n = s.length();
        String result = "";

        for (int i = n-1; i>=0; i--){
            result = result + s.charAt(i);

        }
        System.out.println(result);
        return result;
    }
    public static String reverse2(String s){
        int n = s.length();

        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
        String result = sb.toString();
        return result;
    }
    public static String reverse3(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;
        String result = "";
        for(int i = n-1; i>=0; i--){
            result = result + arr[i];
        }
        System.out.println(result);

        return String.valueOf(arr);
    }

    public static void frequency(String s){
        int n = s.length();
        HashMap<Character,Integer>  map = new HashMap<>();
        for (int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
               int val =  map.get(ch);
               map.put(ch,val+1);
            }
            else {
                map.put(ch , 1);
            }
        }
        System.out.println(map);
        Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();

//        System.out.println(entrySet);
        String result1 = " ";
        String result = " ";

        for (Map.Entry<Character,Integer> entry:entrySet){
//            System.out.println(entry);
//            System.out.println(entry.getKey()+" "+entry.getValue());
            result = result+ entry.getKey()+entry.getValue();
            for (int i=0; i<entry.getValue(); i++){
                result1 = result1 +entry.getKey();
            }

        }
        System.out.println(result1);
        System.out.println(result);
    }

}
//adiinnn