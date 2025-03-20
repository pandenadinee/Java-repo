package com.program;

public class StringReverseInSpecialCharacter {
    public static void main(String[] args) {
        String s = "test.12@gmail.com";
//                  mocl.ia@mg21t.set
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (Character.isLetterOrDigit(arr[left]) && Character.isLetterOrDigit(arr[right])) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (Character.isLetterOrDigit(arr[left]) == false) {
                left++;
            } else if (Character.isLetterOrDigit(arr[right]) == false) {
                right--;
            }
        }
        return String.valueOf(arr);
    }
}
