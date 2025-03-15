package com.oops;

public class Professors {
    int ProId;
    String ProName;
    String  Subject;

    Professors(int ProId, String ProName, String Subject){
        this.ProId = ProId;
        this. ProName = ProName;
        this.Subject  = Subject;

    }

    public static void main(String[] args) {
        Professors p = new Professors(101,"puja" , "Java");
        Univercity u = new Univercity("VMV" ,"Wardhman nagar" ,"CS and IT",p);
        System.out.println(u.Faculty+" "+u.UniAddress+" "+u.UName+" "+u.p.Subject+" "+u.p.ProName+" "+u.p.ProId);
        u = null;
        System.out.println(p.ProId);
        System.out.println(u.Faculty);
        System.out.println(u.p.ProId);
    }
}
