package com.ar.oops.polymorphisam.compileTimePolymorphisam.foodService;

public class FoodOrder extends  Customar{
   private String foodname;
  private   int quantity ;
  private   double price ;

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  FoodOrder(String customername , String customercity , String foodname ){
      super(customername,customercity);
      this.foodname= foodname;

  }
  public void orderFoods(String foodname){
      System.out.println(" Most Delsiyes Foodname: " +foodname);

  }
  public void orderFoods( String foodname , int quantity){
      System.out.println("foodname We are Expecting to: " +foodname);
      System.out.println("Quantity we are expecting to: "+ quantity);

  }
  public void orderFoods( String foodname ,int quantity,double price){
      System.out.println("foodname: " +foodname);
      System.out.println("Quantity "+ quantity);
      System.out.println("price "+ price);
  }
  public void displayCustomerDetails( ){
      System.out.println("Customer Name: " +getCustomername());
      System.out.println("Customer City: " +getCustomercity());

  }
}
