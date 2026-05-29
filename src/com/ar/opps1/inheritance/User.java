package com.ar.opps1.inheritance;

public class User {
    public static void main(String[] args) {
        TeamLead tl = new TeamLead();
        // Employee methods
        tl.login();
        tl.lunchTiming();
        tl.workHours();

        // Tester methods
        tl.testApplication();
        tl.testReturnsCodetoDeveloper();

        // Developer methods
        tl.checkCode();
        tl.writeCode();

        // TeamLead methods
        tl.manageTeam();
    }
}
