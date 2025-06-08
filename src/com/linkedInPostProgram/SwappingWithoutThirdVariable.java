package com.linkedInPostProgram;

public class SwappingWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        swap(a ,b );

    }
    public static void swap(int a , int b){
        a = a + b;
        b = a-b;
        a = a-b;
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
    }
}
