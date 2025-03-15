package com.StringProgram;

public class WordReverse {
    public static void main(String[] args) {
        String s = "My name is Nandini";
        String[] arr =s.split(" ");
        int n = arr.length;
        String result = " ";
        StringBuilder sb = new StringBuilder();
        for(int i = n-1; i>=0; i--){
          sb.append(arr[i]).append(" ");
        }
        String res = sb.toString().trim();
        System.out.println(res);

        String[] arr2 = res.split(" ");
        int n2 = arr2.length;
        String add =" ";
        for(int j=0; j<n2; j++){
            String word = arr2[j];
            add = add + reverse(word)+" ";
        }
        add  =add.trim();
        System.out.println(add);
    }
    public static String reverse(String word){
       StringBuilder sb = new StringBuilder();
       int n = word.length();
       for( int i = n -1; i >= 0; i-- ){
           sb.append(word.charAt(i));
       }
       return  sb.toString();


    }
}
