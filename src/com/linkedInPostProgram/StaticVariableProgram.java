package com.linkedInPostProgram;

public class StaticVariableProgram {

    static String collegeName = "JainUniversity";


    public static void main(String[] args) {

        System.out.println(StaticVariableProgram.collegeName);

        StaticVariableProgram sp = new StaticVariableProgram();
        sp.collegeName = "GUNU University";
        System.out.println(sp.collegeName);

    }
}
