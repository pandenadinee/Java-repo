package com.StringProgram;

public class ReverseDemo4 {
    public static void main(String[] args) {
        String  s = "abcdefghi";
        int n = s.length();
        System.out.println(Reverse(s,2,6));
    }
    public static String Reverse(String s ,int i ,int j ){
        char[] ch = s.toCharArray();
        int n = ch.length;
        while (i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String ans = String.valueOf(ch);
        return ans;
    }
}
