package com.ar.opps.inheritance;

public class User {
    public static void main(String[] args) {
        TeamLead tl = new TeamLead();
        // Employee methods
        tl.login();
        tl.lunchTimeing();
        tl.workHours();

        // Tester methods
        tl.testApplication();
        tl.testReturnsCodetoDeveloper();

        // Developer methods
        tl.CheckCode();
        tl.writeCode();

        // TeamLead methods
        tl.manageTeam();
    }
}
