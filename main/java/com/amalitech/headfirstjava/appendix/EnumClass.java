package com.amalitech.headfirstjava.appendix;


public enum EnumClass{
    JOHN("John Lennon", "Rhythm Guitar"),
    PAUL("Paul McCartney", "Bass"),
    GEORGE("George Harrison", "Lead Guitar"),
    RINGO("Ringo Starr", "Drums");

    private final String fullName;
    private final String instrument;

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
}
