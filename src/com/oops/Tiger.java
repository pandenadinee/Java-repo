package com.oops;

public class Tiger extends Animal {
    int TigerNo;
    String TigerName;
     Tiger(int TigerNo , String TigerName){
         super("wild" , 100);
         this.TigerName = TigerName;
         this.TigerNo = TigerNo;
     }

    @Override
    public void saound() {
        System.out.println("Tiger is very dangorus and intelligent animal");
    }

    public static void main(String[] args) {
        Tiger t = new Tiger(10 ,"Shera");
        t.saound();
        Animal a = new Animal("local" , 500 );
        a.saound();

    }
}
