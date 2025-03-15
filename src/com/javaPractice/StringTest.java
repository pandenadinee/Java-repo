package com.javaPractice;

public class StringTest {
    public static void main(String[] args) {
//        String s = "aarushi";
        String name = "KANAhK";
//       String1(s);
//       String2(s);
       pallindrom(name);
    }
    public static void String1 (String s){
        String s1 = "";
        int n = s.length();
        for(int i =n-1; i>=0; i--){
            s1 = s1+s.charAt(i);
        }
        System.out.println(s1);
    }
    public static void String2(String s){
        int n = s.length();
        char[] ch = s.toCharArray();
        String  s1 = " ";
        for (int i = n-1; i>=0; i--){
            s1 = s1+ch[i];
        }
        System.out.println(s1);
    }
    public static void pallindrom(String name){
        int n = name.length();
        boolean check = true;
        int f = 0;
        int l = n-1;
        while (f<l){
            char first = name.charAt(f);
            char last = name.charAt(l);
            if(first != last){
                check = false;
                break;
            }
            f++;
            l--;
         }
        if (check == true){
            System.out.println("it is pallidrome");
        }
        else {
            System.out.println("it is not pallindrome");
        }

        }
    }


