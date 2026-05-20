package com.ar.oops.polymorphisam.compileTimePolymorphisam.foodService;

public class Customar {
    private String customername ;
   private  String customercity ;

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomercity() {
        return customercity;
    }

    public void setCustomercity(String customercity) {
        this.customercity = customercity;
    }

    Customar(String customername , String customercity){
       this.customername = customername;
       this.customercity = customercity;


   }
}
