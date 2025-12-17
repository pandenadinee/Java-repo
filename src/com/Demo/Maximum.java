package com.Demo;

public class Maximum {
    public static void main(String[] args) {
      int [] arr = {1,2,3,5,8,4,6,9};
      max(arr);

    }
    public static void max(int [] arr){
        int n = arr.length;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i<n; i++){
            if (arr[i] > firstMax ){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if (arr[i] > secondMax & secondMax < firstMax ){
                secondMax = arr[i];
            }

        }
        System.out.println(firstMax);
        System.out.println(secondMax);
    }
}
