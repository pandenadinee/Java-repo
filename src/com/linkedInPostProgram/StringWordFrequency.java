package com.linkedInPostProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringWordFrequency {
    public static void main(String[] args) {
        String s = "my name is nandini my surname is pande";
        frequency(s);

    }

    public static void frequency(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = arr[i];
            if (map.containsKey(word)) {
                int val = map.get(word);
                map.put(word, val + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
        System.out.println("**************************");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }
    }
}
