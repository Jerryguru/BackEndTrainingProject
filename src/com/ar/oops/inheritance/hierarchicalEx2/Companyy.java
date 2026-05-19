package com.ar.oops.inheritance.hierarchicalEx2;

public class Companyy {
   private String CompanyName ;
    private String location;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    Companyy(String CompanyName , String location){
        this.CompanyName= CompanyName;
        this.location= location;

    }
    void companyDetails(){
        System.out.println("Company name that we know: "+ CompanyName);
        System.out.println("Company location that we know: "+ location);
    }
}
