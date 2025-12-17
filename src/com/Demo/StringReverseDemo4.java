package com.Demo;

public class StringReverseDemo4 {
    public static void main(String[] args) {

        String s = "i am nandini pandey";

        System.out.println(reverse(s).trim());

    }
    public static String reverse(String s ){
        char[] ch = s.toCharArray();
        int n = ch.length;
        StringBuilder sb = new StringBuilder();

        for (int i = n-1; i>=0; i--){
            sb.append(ch[i]);
        }
        return sb.toString();
    }
}
