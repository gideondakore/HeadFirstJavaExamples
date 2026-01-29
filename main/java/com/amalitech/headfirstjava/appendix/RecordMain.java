package com.amalitech.headfirstjava.appendix;

public class RecordMain {

    public static void main(){
        Customer customer = new Customer(7, "me");
        System.out.println(customer);
        System.out.println(customer.name());
    }
}
