package com.amalitech.headfirstjava.appendix;

import java.util.regex.Pattern;

public record CustomerOverrideMethod(int id, String name) {
    private static final String NAME_REGEX = "^[A-ZÀ-ÿ][-,a-z.' ]+( [A-ZÀ-ÿ][-,a-z.' ]+)+$";
    private static final Pattern namePattern = Pattern.compile(NAME_REGEX);

    public boolean isValidName(){
        return this.name != null && namePattern.matcher(this.name).matches();
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        CustomerOverrideMethod that = (CustomerOverrideMethod) o;
        return id == that.id && name.equals(that.name);
    }
}
