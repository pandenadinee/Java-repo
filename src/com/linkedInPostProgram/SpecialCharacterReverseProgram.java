package com.linkedInPostProgram;

public class SpecialCharacterReverseProgram {
    public static void main(String[] args) {
        String s = "test.@.123.gmail.com";
//                  mocl.@.iam.g321t.set
        char[] ch = s.toCharArray();
        int n = ch.length;
        int left = 0;
        int right = n-1;
        while (left < right){
            if (isCharacter(ch[left]) && isCharacter(ch[right])){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            else if (isCharacter(ch[left]) == false){
                left++;
            }
            else if (isCharacter(ch[right]) == false){
                right--;
            }
        }
        String result = String.valueOf(ch);
        System.out.println(result);

    }
    public static boolean isCharacter(char ch){
        String character = "abcdefghijklmnopqrstuvwxyz123456";
        int i = character.indexOf(ch);
        if (i >= 0){
            return true;
        }
        else{
            return false;
        }
    }
}
