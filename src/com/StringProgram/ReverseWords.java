package com.StringProgram;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "I am living in Banglore";
        String[] arr = s.split(" ");
        int n = arr.length;
        String result = " ";
        for(int i = 0; i<n; i++ ){
            String word= arr[i];
            result = result + reverse(word)+" ";
        }
        System.out.println(result);

    }
    public static String reverse(String word) {
        char[] ch = word.toCharArray();
        int n = ch.length;
        int i = 0;
        int j = n-1;
        while (i<j){
            char temp = ch[i];
            ch[i] =ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String rev = String.valueOf(ch);
        return rev;

    }

}
