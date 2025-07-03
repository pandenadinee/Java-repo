package com.linkedInPostProgram;

public class ReverseVowelOfString {
    public static void main(String[] args) {
        String s = "programming is fun";
//                  prugrimming as fon
        char[] arr = s.toCharArray();
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left <right){
            if (isVowel(arr[left]) && isVowel(arr[right])){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right --;
            }
            else if (isVowel(arr[left]) == false){
                left++;
            }
            else if (isVowel(arr[right])== false){
                right--;
            }
        }
        String result = String.valueOf(arr);
        System.out.println(result);
    }
    public static boolean isVowel(char c){
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(c) >= 0;

}
}
