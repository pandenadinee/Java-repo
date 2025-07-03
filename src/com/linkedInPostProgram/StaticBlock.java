package com.linkedInPostProgram;

public class StaticBlock {

    static String message;
    static String companyName ;

    static {
        System.out.println("Static Block is executed");
        message = "Hello from Static Block";
        companyName = "Cognizant";
    }

    public static void main(String[] args) {
        System.out.println("Main method is executed");
        System.out.println("Message : " + StaticBlock.message);
        System.out.println("Company name is :" + StaticBlock.companyName);

    }

}
