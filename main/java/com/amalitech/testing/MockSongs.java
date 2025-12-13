package com.amalitech.testing;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {


    public static List<String> getSongString(){

        List<String> songs = new ArrayList<>();
        songs.add("somersault");
        songs.add("cassidy");
        songs.add("$10");
        songs.add("havana");
        songs.add("50 ways");

        return songs;

    }

    public static List<Songv2> getSongsV2(){
        List<Songv2> songs = new ArrayList<>();
        songs.add(new Songv2("somersault", "zero 7", 147));
        songs.add(new Songv2("cassidy", "grateful dead", 158));
        songs.add(new Songv2("$10", "hitchicker", 140));

        songs.add(new Songv2("havana", "cabello", 105));
        songs.add(new Songv2("Cassidy", "grateful dead", 158));
        songs.add(new Songv2("50 ways", "simon", 102));
        return songs;
    }

    public static List<Songv3> getSongsV3(){
        List<Songv3> songs = new ArrayList<>();
        songs.add(new Songv3("somersault", "zero 7", 140));
        songs.add(new Songv3("cassidy", "grateful dead", 158));
        songs.add(new Songv3("$10", "hitchicker", 140));
        songs.add(new Songv3("50 ways", "simon", 10));
        songs.add(new Songv3("somersault", "zero 7", 147));
        songs.add(new Songv3("havana", "cabello", 105));
        songs.add(new Songv3("Cassidy", "grateful dead", 158));
        songs.add(new Songv3("50 ways", "simon", 10));

        return songs;
    }

    // Factory generic method
//    public static <T> MockSongs<T> createMockSongs() {
//        return new MockSongs<T>();
//    }
}

/*
/usr/java/jdk-25-oracle-x64/bin/java -javaagent:/home/zedcurl/.local/share/JetBrains/Toolbox/apps/intellij-idea-community-edition/lib/idea_rt.jar=40541 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/zedcurl/Desktop/JavaResources/AmaliTech/HeadFirstJavaExamples/out/production/Testing com.amalitech.testing.Jukebox5
Before Set: [$10, 50 ways, 50 ways, Cassidy, cassidy, havana, somersault, somersault]
After Set: [somersault, 50 ways, $10, cassidy, somersault, 50 ways, Cassidy, havana]

Process finished with exit code 0

// Without hashcode
Before Set: [$10, 50 ways, 50 ways, Cassidy, cassidy, havana, somersault, somersault]
After Set: [somersault, 50 ways, $10, cassidy, somersault, 50 ways, Cassidy, havana]


===============================================================
// WIth hashcode
Before Set: [$10, 50 ways, 50 ways, Cassidy, cassidy, havana, somersault, somersault]
Running equals method
Running equals method
After Set: [havana, Cassidy, $10, 50 ways, cassidy, somersault, somersault]
 */

