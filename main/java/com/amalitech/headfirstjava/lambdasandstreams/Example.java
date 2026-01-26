package com.amalitech.headfirstjava.lambdasandstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args){

        List<String> colors = List.of("Red", "Blue", "Yellow");

//        colors.forEach(color -> IO.println(color));

        streamsEg();
    }

    public static void streamsEg(){
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        Stream<String> stream = strings.stream();

        Stream<String> str = stream.filter(s -> s.length() > 2);
        List<String> list = str.collect(Collectors.toList());

        IO.println("Streams: " + list);
    }
}
