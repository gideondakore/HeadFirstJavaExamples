package com.amalitech.headfirstjava.appendix;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum EnumClass{
    JOHN("John Lennon", "Rhythm Guitar"),
    PAUL("Paul McCartney", "Bass"),
    GEORGE("George Harrison", "Lead Guitar"),
    RINGO("Ringo Starr", "Drums");

    private final String fullName;
    private final String instrument;

    private static final EnumClass[] $VALUES = {JOHN, PAUL, GEORGE, RINGO};

    EnumClass(String fullName, String instrument) {
        this.fullName = fullName;
        this.instrument = instrument;
    }

    public String getFullName() {
        return fullName;
    }


    public String getInstrument() {
        return instrument;
    }

    public static EnumClass[] enumValues(){
        return $VALUES.clone();
    }

    //Outside code can modify the original enum
    public static EnumClass[] enumValuesNotSafe(){
        return $VALUES;
    }


    public static EnumClass getJohn(){
        return JOHN;
    }

    public static List<EnumClass> listValues(){
        return Collections.unmodifiableList(Arrays.asList($VALUES));
    }
}
