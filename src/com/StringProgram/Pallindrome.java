package com.StringProgram;

public class Pallindrome {
    public static void main(String[] args) {
        String s = "RACECARj";
        int n = s.length();
        boolean check = true;
        int first = 0;
        int last = n-1;
        while (first<last){
            char f = s.charAt(first);
            char l = s.charAt(last);
            if(f!=l){
                check =false;
                break;
            }
            first++;
            last--;
        }
        if(check==true){
            System.out.println("it is pallindrome");
        }
        else {
            System.out.println("it is not pallindrome");
        }
    }
}
