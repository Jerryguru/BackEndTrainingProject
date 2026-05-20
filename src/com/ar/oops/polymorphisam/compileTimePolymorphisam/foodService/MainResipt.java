package com.ar.oops.polymorphisam.compileTimePolymorphisam.foodService;

public class MainResipt {
   public static void main(String[] args) {
        FoodOrder f1= new FoodOrder("jerry Paramesh","Bangalore", "Biryani");

f1.displayCustomerDetails();
       System.out.println();
       f1.orderFoods("Biryani: ");
       System.out.println();
       f1.orderFoods("Thandhoori",2);
       System.out.println();
       f1.orderFoods( "chickenkabab",5,999.99);



    }

}



















/*
*Food Ordering System — Full Explanation

You created a very good real-time Java OOPS example 👍

This program uses:

Classes & Objects
Encapsulation
Inheritance
Constructor
Constructor Chaining using super
Method Overloading
Compile Time Polymorphism
Project Flow
Customer  →  FoodOrder  →  MainReceipt
1. Customer Class
public class Customar {

This is the parent class.

It stores customer information.

Variables
private String customername;
private String customercity;

These variables are private.

Why private?

✅ Data protection
✅ Encapsulation
✅ Direct access is restricted

Only methods inside the class can access them.

Getter Methods
public String getCustomername() {
    return customername;
}

Getter methods are used to READ data.

Example:

System.out.println(getCustomername());
Setter Methods
public void setCustomername(String customername) {
    this.customername = customername;
}

Setter methods are used to STORE/UPDATE data.

Constructor
Customar(String customername , String customercity)

Constructor is automatically called when object is created.

Example:

new Customar("Jerry", "Bangalore");
this Keyword
this.customername = customername;

Here:

LEFT side:

this.customername

means class variable

RIGHT side:

customername

means local parameter variable

this keyword differentiates them.

2. FoodOrder Class
public class FoodOrder extends Customar

This is child class.

It inherits properties from Customar.

extends Keyword
extends Customar

means:

FoodOrder IS-A Customer

FoodOrder can access Customer methods.

Example:

getCustomername()
getCustomercity()
FoodOrder Variables
private String foodname;
private int quantity;
private double price;

These store food order details.

Constructor in Child Class
public FoodOrder(String customername,
                 String customercity,
                 String foodname)

This constructor initializes FoodOrder object.

super Keyword
super(customername, customercity);

This calls parent class constructor.

Flow:

FoodOrder constructor
        ↓
super()
        ↓
Customer constructor

So customer data is initialized in parent class.

Why super is Important?

Because parent class variables are private.

Child class cannot directly access:

customername
customercity

So we use parent constructor through super.

this.foodname
this.foodname = foodname;

Stores food name into class variable.

Method Overloading

This is the main concept in your program.

Method 1
public void orderFoods(String foodname)

Only food name.

Example:

f1.orderFoods("Biryani");
Method 2
public void orderFoods(String foodname, int quantity)

Food name + quantity.

Example:

f1.orderFoods("Tandoori", 2);
Method 3
public void orderFoods(String foodname,
                       int quantity,
                       double price)

Food name + quantity + price.

Example:

f1.orderFoods("Chicken Kabab", 5, 999.99);
Why is this Method Overloading?

Because:

✅ Same method name

orderFoods()

✅ Different parameters

Java decides which method to call based on arguments.

This is called:

Compile Time Polymorphism
displayCustomerDetails()
public void displayCustomerDetails()

Displays customer information.

Using Inherited Methods
getCustomername()
getCustomercity()

These methods come from parent class.

This is inheritance.

MainReceipt Class
public class MainResipt

Execution starts from:

public static void main(String[] args)
Object Creation
FoodOrder f1 =
new FoodOrder("Jerry Paramesh",
              "Bangalore",
              "Biryani");

Object is created.

Constructor automatically executes.

Memory Understanding
f1
 ↓
--------------------------------
customername = Jerry Paramesh
customercity = Bangalore
foodname = Biryani
quantity = 0
price = 0.0
--------------------------------
Method Calling
f1.orderFoods("Biryani");

Java checks:

Which method has 1 parameter?

Calls:

orderFoods(String foodname)
f1.orderFoods("Tandoori",2);

Java checks:

Which method has 2 parameters?

Calls:

orderFoods(String foodname, int quantity)
f1.orderFoods("Chicken Kabab",5,999.99);

Calls:

orderFoods(String,int,double)
Final Output Flow
Object Creation
      ↓
Constructor Executes
      ↓
super() calls Parent Constructor
      ↓
Customer Data Stored
      ↓
Methods Called
      ↓
Overloaded Methods Execute
      ↓
Output Printed
OOPS Concepts Used
Concept	Where Used
Class	Customer, FoodOrder
Object	f1
Encapsulation	private variables
Getter/Setter	getCustomername()
Inheritance	extends Customer
Constructor	FoodOrder()
super keyword	super()
this keyword	this.foodname
Polymorphism	orderFoods()
Method Overloading	Same method different parameters
*
*
*
*
*
*
*
*
* */