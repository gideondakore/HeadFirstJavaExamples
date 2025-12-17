package com.amalitech.testing.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {

    public static void main(String[] args){
        try{

            // Using FileWriter DO NOT add any buffering

            File f = new File("Foo.txt");
            FileWriter writer = new FileWriter(f);

            writer.write("Tadda!");

            writer.close();

            FileReader reader = new FileReader(f);
            IO.println(reader.ready());
            reader.close();

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
