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

        CustomerOverrideMethod customerOverrideMethod  = new CustomerOverrideMethod(7, "Him Her");
        CustomerOverrideMethod customerOverrideMethod1 = new CustomerOverrideMethod(7, "Him");
        System.out.println("Is customerOverrideMethod == customerOverrideMethod1: " + customerOverrideMethod.equals(customerOverrideMethod1));
        System.out.println("Is valid name: " + customerOverrideMethod.isValidName());
    }
}
