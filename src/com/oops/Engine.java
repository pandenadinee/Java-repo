package com.oops;

public class Engine {
    int EngineNo;
    String model;
    Engine(int EnineNo , String model){
        this.EngineNo = EnineNo;
        this.model = model;

    }

    public static void main(String[] args) {
        Car c = new Car(200,"maruti");
        System.out.println(c.CarNo+" "+c.CarName+" "+c.e.EngineNo+" "+c.e.model);
        c =null;
        System.out.println(c.e.EngineNo);



    }
}
