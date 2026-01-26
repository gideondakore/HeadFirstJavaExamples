package com.amalitech.headfirstjava.nio_files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOFiles {

    public static void main(String[] args){
        Path myPath = Paths.get("Foo.txt");
        Path myPathFullPath = Paths.get("/home", "gideon-dakore", "IdeaProjects", "HeadFirstJavaExamples", "Foo.txt");

        try{
            try(BufferedWriter writer = Files.newBufferedWriter(myPathFullPath)){
                writer.write("NIO.2 File write Test full Path");
            }
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
