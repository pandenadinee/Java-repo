package com.practice;

public class Maximum {
    public static void main(String[] args) {
        int[] numbers = {25, 78, 45, 99, 12, 56, 102, 67};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        findingMax(numbers,firstMax,secondMax);


    }
    public static void findingMax(int[] numbers , int firstMax , int secondMax){

        int n = numbers.length;
        for(int i = 0; i<n; i++){
            if (numbers[i] > firstMax){
                secondMax = firstMax;
                firstMax = numbers[i];
            }
            else if (numbers[i] > secondMax & secondMax < firstMax){
                secondMax = numbers[i];
            }
        }
        System.out.println(firstMax );
        System.out.println(secondMax);
    }
}
