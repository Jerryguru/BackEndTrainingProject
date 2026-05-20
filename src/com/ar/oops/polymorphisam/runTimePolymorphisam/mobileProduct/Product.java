package com.ar.oops.polymorphisam.runTimePolymorphisam.mobileProduct;

public class Product {
private String productName;
 private    double productPrice;
   private int productQuantity;
    Product(String productName , double productPrice , int productQuantity){
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity =productQuantity;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    void displayProductDetails(){
        System.out.println("The Productname should be: "+productName);
        System.out.println("the Product Price should be: "+productPrice);
        System.out.println("The product Quanioty should be: "+productQuantity);

    }
    void calculateTotalPrice(){
        double total = productPrice*productQuantity;
        System.out.println("The Total Price: "+total);
    }


}
