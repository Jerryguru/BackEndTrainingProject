package com.ar.exceptionHandling.arrayIndexOutOfBoundsException;

public class Test2 {
     public static void main(String[] args) {
        try{
            int arr[]={10,20,30};
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invallind Array Index");
        }finally {
            System.out.println("Array is index out of range ");
        }
    }
}
