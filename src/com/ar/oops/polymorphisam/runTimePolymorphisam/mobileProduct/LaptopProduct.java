package com.ar.oops.polymorphisam.runTimePolymorphisam.mobileProduct;

public class LaptopProduct extends Product{
    private String processor;
    private String operatingSystem;
    LaptopProduct(String productName , double productPrice , int productQuantity ,String processor,String operatingSystem){
        /*
        * here i have a dought on hear here in constructor we called paren class variables
        *  but not called child class Mobile product variabls are called why?
        * the answer is ikada manam only parent class ni matukey pilusthunam kanuka
        * ikada manam laptopproiduct ki parent class haina mobile product ni pilavadam ledhu
        * only calling the main parentr class so we dont want to use the mobile product variabls on here 
        *
        * */
        super(productName,productPrice,productQuantity);
        this.processor= processor;
        this.operatingSystem= operatingSystem;

    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    @Override
    void displayProductDetails() {

        System.out.println("----- LAPTOP DETAILS -----");

        System.out.println("Laptop Product name is: "+getProductName());
        System.out.println("Laptop Product Price is: "+getProductPrice());
        System.out.println("Laptop Product Quantitys: "+getProductQuantity());

        System.out.println("Laptop Product Processor is: " + getProcessor());

        System.out.println("Laptop Product Operating System is: " + getOperatingSystem());
        /*
        * And here why we are not used the getProcesser and getOperatingSystem
        * */
    }
    void codingPurpose() {

        System.out.println("Laptop is suitable for Java development.");
    }
}
