package com.ar.exceptionHandling.arrayIndexOutOfBoundsException;

public class EmployeeApp {
    static void getEmployee(String employes[],int index)
        throws ArrayIndexOutOfBoundsException {
        if (index >= employes.length) {
            throw new ArrayIndexOutOfBoundsException("Employee Not Found");
        } System.out.println(employes[index]);

    }
   public static void main(String[] args){
            String employes[]={
                    "jerry","paramesh","guru"};
            try {
                getEmployee(employes,10);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("Employee Search Completed");
            }

    }
}
