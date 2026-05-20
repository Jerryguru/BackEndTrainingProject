package com.ar.oops.polymorphisam.runTimePolymorphisam.mobileProduct;

public class MobileProduct extends Product{
 private    String mobileBrand;
   private int ramSize;
   MobileProduct(String productName , double productPrice , int productQuantity ,String mobileBrand ,int ramSize ){
       super(productName,productPrice,productQuantity);
       this.mobileBrand= mobileBrand;
       this.ramSize= ramSize;
   }

    public String getMobileBrand() {
        return mobileBrand;
    }

    public void setMobileBrand(String mobileBrand) {
        this.mobileBrand = mobileBrand;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    void displayProductDetails(){
        System.out.println("*****Mobile Details******");
        System.out.println("Mobile Product name is: "+getProductName());
        System.out.println("Mobile Product Price is: "+getProductPrice());
        System.out.println("Mobile Product Quantitys: "+getProductQuantity());
        System.out.println("Mobile Product Brand is: "+getMobileBrand());
        System.out.println("Mobile Product RamSize is: "+getRamSize());
    }
    void mobileFeatures() {

        System.out.println(mobileBrand + " mobile has excellent camera quality."
        );
    }
}
