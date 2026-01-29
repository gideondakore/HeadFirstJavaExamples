package com.amalitech.headfirstjava.appendix;

public record CustomerWithOverride(int id, String name) {
    // This is the canonical constructor (implicitly generated). // You CAN NOT add throw to it signature and therefore the Exception must extend RuntimeException
    public CustomerWithOverride(int id, String name) {
        if(id < 0){
            throw new ValidationException("ID cannot be negative: From Uncheck");
        }

        this.id = id;
        this.name = name;
    }

    // Compact Form Constructor
//    public CustomerWithOverride{
//        if(id < 0){
//            throw new IllegalArgumentException("ID must be positive: From Uncheck");
//        }
//        // Field assignments happen automatically after this block
//    }

}
