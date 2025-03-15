package com.StringProgram;

import java.util.Arrays;

public class RevisionDemo2 {
    public static void main(String[] args) {
        String s1 = "God";
        String s2 = "Dog";
//        System.out.println(isAnnagram(s1, s2));

        String s = "test.@123.gmail.com";
//                    mocl.@iam.g321t.set
        System.out.println(reverse(s));
    }

    public static boolean isAnnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] arr1 = s1.toCharArray();
        int n = arr1.length;
        Arrays.sort(arr1);

        char[] arr2 = s2.toCharArray();
        int n2 = arr2.length;
        Arrays.sort(arr2);

        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int first = 0;
        int last = n - 1;

        while (first < last) {
            if (Character.isLetterOrDigit(arr[first]) && Character.isLetterOrDigit(arr[last])) {
                char temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
            }
            else if (Character.isLetterOrDigit(arr[first]) == false) {
                first++;
            } else if (Character.isLetterOrDigit(arr[last]) == false) {
                last--;
            }


        }
        String result = String.valueOf(arr);
        return result;
    }
}