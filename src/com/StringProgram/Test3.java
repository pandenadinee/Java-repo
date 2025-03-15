package com.StringProgram;

public class Test3 {
    public static void main(String[] args) {
        String s = "aarushi";
        reverse(s);

        String s1 = "hi i am nandini";
        wordReverse(s1);


    }
    public static void reverse(String s ){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = n-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
    public static void wordReverse(String s1){
        String[] arr = s1.split(" ");
        int n = arr.length;

        StringBuilder sb = new StringBuilder();
        for(int i =n-1; i>=0; i--){

            sb.append(arr[i]).append(" ");
        }
        String rever = sb.toString();
        System.out.println(rever);

        String [] arr2 = rever.split(" ");
        int n2 = arr2.length;
        String emp = " " ;
        for(int i = 0; i<n2; i++){
            String word =  arr2[i];
            emp = emp +add(word)+" ";

        }
        String ans = emp.trim();
        System.out.println(ans);
    }
    public static String add(String word){
        char[] ch = word.toCharArray();
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
        String send = String.valueOf(ch);
        return send;
    }
}
