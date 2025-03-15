package com.program;

public class NumberReverse1 {
    public static void main(String[] args) {
        int num = 1221;
        int temp = num;
        int result = isPalindrome(num);
        if (result == temp){
            System.out.println("it is pallindrome number:" + result);
        }
        else {
            System.out.println("it is not pallindrome number ");
        }
    }
    public static int isPalindrome(int num ) {

        int sum = 0;
        while (num > 0) {
            int reminder = num % 10;
            sum = (sum * 10) + reminder;
            num = num / 10;

        }
        return sum;
    }

}
