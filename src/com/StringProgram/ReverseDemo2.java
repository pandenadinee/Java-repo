package com.StringProgram;

public class ReverseDemo2 {
    public static void main(String[] args) {
        String s = "hi i am nandini uday pandey";
        String[] arr = s.split(" ");
        int n = arr.length;
        String res = " ";
        for(int i = 0; i<n; i++){
            String word = arr[i];
            res = res +rverse(word)+" ";

        }
        res=res.trim();
        System.out.println(res);
    }
    public static String rverse(String word){

        StringBuilder sb = new StringBuilder();
        int n = word.length();
        for (int j =n-1; j>=0; j--){
            sb.append(word.charAt(j));
        }
       return sb.toString();
    }
}
