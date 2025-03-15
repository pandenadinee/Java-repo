package com.StringProgram;

public class MidCharacterReverse {
    public static void main(String[] args) {
        String s = "abcdefg";
        int n = s.length();
        int l = n / 2;

        System.out.println(reverse(s, 2, n - 3));
        System.out.println(reverse(s, l, n - 1));

    }

    public static String reverse(String s, int i, int j) {
        char[] ch = s.toCharArray();

        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String result = String.valueOf(ch);
        return result;

    }


}
