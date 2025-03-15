package com.StringProgram;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        String s = "abbbcccca";
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            char key = s.charAt(i);
            if(map.containsKey(key)){
                int val = map.get(key);
                map.put(key,val+1);
            }
            else {
                map.put(key,1);
            }
        }
        System.out.println(map);
    }
}
