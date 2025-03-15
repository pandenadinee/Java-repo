package com.StringProgram;

public class StringConsunentReverse {
    public static void main(String[] args) {
        String s = "gday";
        char[] ch = s.toCharArray();
        int n = ch.length;

        int left = 0;
        int right = n-1;

        while (left < right){
            if(isConsunent(ch[left]) & isConsunent(ch[right])){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            else if(isConsunent(ch[left]) == false){
                left++;
            }
            else if(isConsunent(ch[right]) == false){
                right--;
            }
        }
       String re = String.valueOf(ch);
        System.out.println(re);

    }
    public static boolean isConsunent(char ch){
        String patt = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ0123456789";
       int value =  patt.indexOf(ch);
       if(value >=0)
       {
           return true;
       }
        return false;
    }


}
