package com.Demo;

public class StringReverseDemo3 {
    public static void main(String[] args) {
        String s = "i am nandini pandey";
        String[] arr = s.split(" ");
        int n = arr.length;
        String result = "";
        for (int i = 0; i<n; i++){
            String word = arr[i];
            result = result + reverse(word)+" ";
        }

        System.out.println(result.trim());

    }
    public static String reverse(String word){
        char[] ch = word.toCharArray();
        int m = ch.length;
        int i = 0;
        int j = m-1;
        while (i<j){
            char temp =ch[i] ;
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);

    }
}
