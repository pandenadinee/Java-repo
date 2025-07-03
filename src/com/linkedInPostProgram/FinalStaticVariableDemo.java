package com.linkedInPostProgram;

public class FinalStaticVariableDemo {
     static final String APP_NAME = "MyApplication";
     static final int MAX_USERS ;

     static {
         MAX_USERS = 100;
     }

    public static void main(String[] args) {
        System.out.println("Application: " + APP_NAME);
        System.out.println("Maximum Users Allowed: " + MAX_USERS);
    }
}
