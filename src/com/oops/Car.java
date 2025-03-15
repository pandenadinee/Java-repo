package com.oops;

public class Car {
    int CarNo;
    String CarName;

    Car(int CarNo, String CarName){
        this.CarName = CarName;
        this.CarNo = CarNo;
    }
    Engine e = new Engine(100,"suzuki");


}
