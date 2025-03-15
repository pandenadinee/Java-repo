package com.StringProgram;

public class ReverseProgram {
    public static void main(String[] args) {
        String s = "this is my practice program";

//        System.out.println(reverse1(s));

        String[] arr = s.split(" ");

        String result = "";
        int n = arr.length;
        for(int i = 0; i<n; i++){
            String add = arr[i];
            result = result+reverse2(add)+" ";
        }
        result = result.trim();

//        System.out.println(result);

        System.out.println(reverse3(s));

    }
    public static String reverse1(String s){
        String[] arr = s.split(" ");
        int n = arr.length;

        StringBuilder sb = new StringBuilder();
        for(int i = n-1; i>=0; i--){
             sb.append(arr[i]).append(" ");
        }
       return sb.toString();
    }
    public static String reverse2(String add){
        char[] ch = add.toCharArray();
        int n = ch.length;
        int i = 0;
        int j = n-1;
        while (i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(ch);
    }
    public static String reverse3(String s){
        char[] ch = s.toCharArray();
        int n = ch.length;
        StringBuilder sb = new StringBuilder();

        for(int i = n-1 ; i>=0; i--){
            sb.append(ch[i]);
        }

        return sb.toString();
    }


}


