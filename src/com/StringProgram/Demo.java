package com.StringProgram;

public class Demo {
    public static void main(String[] args) {
        String s = "nandini";
//        revers1(s);
//        revers2(s);
//        reverse3(s);

    }
    public static void  revers1(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for(int i = n-1; i>=0; i--){
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
    public static void revers2(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;
        String result = " " ;
        for(int i = n-1; i>=0; i--){
            result = result +arr[i];
        }
        System.out.println(arr);
    }
    public static void reverse3(String s){
        int n = s.length();
        String res = " ";

        for(int i =n-1; i>=0; i--){
            res = res+s.charAt(i);
        }
        System.out.println(res);
    }

}
