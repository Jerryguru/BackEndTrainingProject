package com.ar.oops.inheritance;

public class User {
    public static void main(String[] args) {
        Tester t1 = new Tester();
        t1.read();
        Developer d1 = new Developer();
        d1.read();
        d1.codewriter();
        AdminDeveloper ad = new AdminDeveloper();
        ad.read();
        ad.manage();
        ad.codewriter();
    }
}
