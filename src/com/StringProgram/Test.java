package com.StringProgram;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        int rotation = 2;
        int k = rotation % n;
        for (int i = 1; i <= k; i++) {
            int temp = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }


}

// 1, 2, 3, 4, 5, 6
// 6, 5, 4, 3, 2, 1
// 0, k- 1, k to n - 1
// k = 2;

// 5, 6, 1, 2, 3, 4

// 5, 6, 1, 2, 3, 4
