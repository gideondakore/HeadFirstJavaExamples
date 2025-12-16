package com.amalitech.testing.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class FileTest {

    public static void main(String[] args){


        new FileTest().go();

    }

    public void go(){
        Optional<URL> uri = Optional.ofNullable(getClass().getResource("WriteText.txt"));
//        Optional<String> uri = Optional.of("/home/gideon-dakore/IdeaProjects/HeadFirstJavaExamples/main/java/com/amalitech/testing/file/WriteText.txt");

        uri.ifPresentOrElse(val -> {
            File f = new File(val.getFile());

            try{

                try(BufferedReader reader = new BufferedReader(new FileReader(f))){
                    String line;
                    while ((line = reader.readLine()) != null){
                        IO.println("Content in File: " + line);
                    }
                }

            }catch (IOException e){
                e.printStackTrace();
            }

        }, () -> IO.println("No file found"));

    }


}
