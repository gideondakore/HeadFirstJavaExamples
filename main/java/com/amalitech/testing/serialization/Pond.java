package com.amalitech.testing.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pond implements Serializable {
    // NB: transient keyword instance variables are skipped during serialization
    private transient Duck duck = new Duck();

    public static void main(String[] args){
        Pond myPond = new Pond();
        try{
            FileOutputStream fs = new FileOutputStream("Pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(myPond);
            os.close();

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}

