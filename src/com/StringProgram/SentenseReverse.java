package com.StringProgram;

public class SentenseReverse {
    public static void main(String[] args) {
        String s = "My name is uday";
        String[] s1 = s.split(" ");
        int n = s1.length;
       String result =" ";
       for(int i = n-1; i>=0; i--){
           result =result+s1[i]+" ";
       }
         result.trim();
        System.out.println(result);
    }
}
