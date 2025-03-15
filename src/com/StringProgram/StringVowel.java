package com.StringProgram;

public class StringVowel {
    public static void main(String[] args) {
        String s = "uday.shankar@gmail.com";
//                  famocl.iamgrak@nahsy.adu
        char[] ch = s.toCharArray();
        int n = ch.length;
        int left = 0;
        int right = n-1;
        while (left < right){
            if(Character.isLetter(ch[left]) & Character.isLetter(ch[right])){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
           else if(Character.isLetter(ch[left]) == false){
               left++;
            }
            else if(Character.isLetter(ch[right]) == false){
                right--;
            }
        }
       String result = String.valueOf(ch);
        System.out.println(result);


    }
}
