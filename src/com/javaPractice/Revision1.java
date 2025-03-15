package com.javaPractice;

import com.InterfacePractice.Animal;

import java.util.Arrays;

public class Revision1 {
    public static void main(String[] args) {
        int number = 123;
//        System.out.println(isPrime(number));


        for(int num =1; num<=100; num++) {
//            if(PrintPrimeNum(num)){
//                System.out.println(num);
//            }
        }

//        fibonacchiNumber(0,1);

        int num = 1537;
//        System.out.println(isArmStrong(num));

//        findPowerOfNumber(9,4);

        int[] arr = {4,9,7,6,3,1,0,8,2};
        int target = 8;
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(BinarySearch(arr, target));

    }
    public static boolean isPrime(int number){{
        if(number < 2){
            return false;
        }
        for(int i = 2; i<Math.sqrt(number); i++){
            if(number % 2 == 0){
                return false;
            }
        }
    }
        return true;
    }
    public static boolean PrintPrimeNum(int num){
        if(num<2){
            return false;
        }
        for(int j = 2; j<=Math.sqrt(num); j++){
            if(num % j == 0){
                return false;
            }
        }
        return true;
    }

    public static void fibonacchiNumber(int first , int second){

        System.out.println(first);

        System.out.println(second);


        for(int i = 3; i<=10; i++){

            int next = first + second;
            System.out.println(next);

            first = second;
            second = next;
        }

    }
    public static boolean isArmStrong(int num){

        int temp = num;
        String s = new String(String.valueOf(num));
        int length = s.length();
        int sum = 0;
        while (num >0){
            int power = num % 10;
            sum = (int) (sum + Math.pow(power,length));
              num = num / 10;

        }
        if (sum == temp){
            System.out.println("it is ArmStrong number");
            return true;
        }
        else {
            System.out.println("it is not ArmStrong number");
            return false;
        }
    }

    public static void findPowerOfNumber(int length , int power){
        int sum = 1;
        for(int i = 1; i <=power; i++ ){
            sum = sum *length;
        }
        System.out.println(sum);
    }
    public static void BubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static int BinarySearch(int[] arr ,int target){
        int n  = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high){
            int mid = (low + high) /2;
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid]<target){
                low = mid+1;
            }
            else if (arr[mid]>target){
                high = mid - 1;
            }
        }
        return -1;
    }
}
