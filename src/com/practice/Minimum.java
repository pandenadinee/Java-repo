package com.practice;

public class Minimum {
    public static void main(String[] args) {
        int[] numbers = {25, 78, 45, 99, 12, 56, 102, 67};
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        findingMinimum(numbers ,firstMin ,secondMin);

    }
    public static void findingMinimum(int[] numbers , int firstMin , int secondMin){
        int n = numbers.length;
        for (int i = 0; i<n; i++){
            if (numbers[i] < firstMin){
                secondMin = firstMin;
                firstMin = numbers[i];

            }
            else if (numbers[i] <secondMin & secondMin > firstMin){
                secondMin = numbers[i];
            }
        }
        System.out.println(firstMin);
        System.out.println(secondMin);
    }
}
