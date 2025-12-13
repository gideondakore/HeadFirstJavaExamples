package com.amalitech.testing;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args){
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Bernard", 90);
        scores.put("Frank", 80);
        scores.put("Kingsley", 100);

        IO.println(scores.get("Bernard"));

    }
}
