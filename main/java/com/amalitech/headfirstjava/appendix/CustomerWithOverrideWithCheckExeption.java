package com.amalitech.headfirstjava.appendix;

public record CustomerWithOverrideWithCheckExeption(int id, String name) {

    //Using Factory method
    public static CustomerWithOverrideWithCheckExeption create(int id, String name) throws ValidationExceptionCheck{
        if(id < 0){
            throw new ValidationExceptionCheck("ID cannot be negative");
        }
        return new CustomerWithOverrideWithCheckExeption(id, name);
    }
}
