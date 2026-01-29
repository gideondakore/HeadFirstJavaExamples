package com.amalitech.headfirstjava.appendix;

public class RecordMain {

    public static void main(){
        Customer customer = new Customer(7, "me");
        System.out.println(customer);
        System.out.println(customer.name());

        try{
            //RuntimeException (Uncheck)
            CustomerWithOverride customerWithOverride = new CustomerWithOverride(11, "you");
            System.out.println(customerWithOverride);
            System.out.println(customerWithOverride.name());

            //Exception / Compile time exception (Check)
//            CustomerWithOverrideWithCheckExeption customerWithOverrideWithCheckExeption = new CustomerWithOverrideWithCheckExeption(5, "I");
            CustomerWithOverrideWithCheckExeption customerWithOverrideWithCheckExeption = CustomerWithOverrideWithCheckExeption.create(-5, "I");
            System.out.println(customerWithOverrideWithCheckExeption);
            System.out.println(customerWithOverrideWithCheckExeption.name());
        }catch (ValidationException | IllegalArgumentException | ValidationExceptionCheck ex){
            System.out.println(ex.getMessage());
        }
    }
}
