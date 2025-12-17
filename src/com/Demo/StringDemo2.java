package com.Demo;

import org.jetbrains.annotations.NotNull;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "i am nandini pandey";
        reverse(s);

    }
    public static String reverse(String s){

         String[] ch = s.split(" ");
         int n = ch.length;

         StringBuilder sb = new StringBuilder();

         for(int i = n-1; i>=0; i--){

             sb.append(ch[i]).append(" ");
         }
                String result = sb.toString();
        System.out.println(result);
          return result;

    }
}
