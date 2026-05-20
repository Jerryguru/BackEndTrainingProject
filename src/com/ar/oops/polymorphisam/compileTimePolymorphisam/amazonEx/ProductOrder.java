package com.ar.oops.polymorphisam.compileTimePolymorphisam.amazonEx;

public class ProductOrder extends Customer{
   private String productName;
  private   int Quantity;
  private   double price;

  public ProductOrder( String customerName , String customercity , String productName){
super(customerName,customercity);
this.productName=productName;
      /*
       * here I have a dought because in child class we extended parent class and given some variables in child class
       * here while we're giving the values to constructor
       * and here it is not accepting all the variables on here it accept only parent variables and only one child variable
       * and more over here this keyword is accepting only for one variable only why ?
       * */

  }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void oderProduct( String productName){
        System.out.println("the product name is:" +productName);
    }
    public void  oderProduct(String productName,int quantity ){
        System.out.println("the product name is: " +productName);
        System.out.println("the quantity of the product is: "+quantity);
    }
    public void  oderProduct(String productName,int quantity ,double price){
        System.out.println("The product name is: " +productName);
        System.out.println("The quantity of the product is: "+quantity);
        System.out.println("The price of the quantity is: "+price);
    }
    public void displayCustomerDetails(){
        System.out.println("The Customer Name is: "+getCustomerName());
        System.out.println("The Customer City Name is: "+ getCustomerCity());
    }
}
