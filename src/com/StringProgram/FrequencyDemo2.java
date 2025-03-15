package com.StringProgram;

import java.util.HashMap;

public class FrequencyDemo2 {
    public static void main(String[] args) {
        String s = "i am nandini i am aarushi i am aparajita";
          String[] arr = s.split(" ");
          int n = arr.length;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            String newKey = arr[i];
            if(map.containsKey(newKey)){
                int val = map.get(newKey);
                map.put(newKey,val+1);
            }
            else{
                map.put(newKey,1);
            }
        }
        System.out.println(map);
    }
}
