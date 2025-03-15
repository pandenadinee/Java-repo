package com.javaPractice;

public class D {
    public static void main(String[] args) {
//        Prime Program Practice

        int num = 13;
        boolean b = isPrime(num);
//        System.out.println(b);

        int num1 = 0;
        int num2 = 100;
        for(int i = num1; i<=num2; i++){
            boolean value = isPrimeNo(i);
            if (value){
//                System.out.println(i);
            }
        }

//        ArmStrong number program practice

        int armNumber = 153;
//        System.out.println(isArmStrong(armNumber));

        int start = 10;
        int end = 1000;
        for(int i = start; i<=end; i++){
            int digit = i;
//           if (ArmStrong(digit))
//               System.out.println(digit);
        }

//        fibonacci number practice
        int first = 0;
        int second = 1;
        fibonacchiNumber(first,second);



    }
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i =2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrimeNo(int number ){
        if(number < 2){
            return false;

        }
        for(int i = 2; i<=Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isArmStrong(int armNumber) {
        int temp = armNumber;
        String s = new String(String.valueOf(armNumber));
        int length = s.length();
        int sum = 0;
        while (armNumber >0){
            int d = armNumber % 10;
            sum = (int) (sum + Math.pow(d,length));
            armNumber = armNumber /10;
        }
//        return sum == temp;
        if(sum == temp){
            System.out.println("it is armStrog");
        }
        else {
            System.out.println("it is not armstrong");
        }
        return sum==temp;
    }
    public static boolean ArmStrong(int digit){
        String s = new String(String.valueOf(digit));
        int n = s.length();
        int temp = digit;
        int sum = 0;
        while (digit>0){
            int d = digit % 10;
            sum = (int) (sum + Math.pow(d,n));
            digit = digit / 10;
        }
        return sum == temp;
        }
        public static void fibonacchiNumber(int first , int second){
            System.out.println(first );
            System.out.println(second);
            for(int i = 3; i<=10; i++){
                int next = first+second;
                System.out.println(next);
                first = second;
                second = next;

            }
        }


    }


