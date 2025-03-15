package com.InterfacePractice;

public interface Bird  {
    void makeSaound();

    default void sleep(){
        System.out.println("all birdies are now sleeping");
    }
}
