package com.amalitech.testing.game;

import java.io.*;

public class GameSaverChange {

    public static void main(String[] args){

        try{
            GameCharacter oneRestore;
            GameCharacter twoRestore;
            GameCharacter threeRestore;
            try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"))) {
                oneRestore = (GameCharacter) is.readObject();
                twoRestore = (GameCharacter) is.readObject();
                threeRestore = (GameCharacter) is.readObject();
//                GameCharacter fourRestore = (GameCharacter) is.readObject();
            }


            IO.println("One's type: " + oneRestore.type());
            IO.println("Two's type: " + twoRestore.type());
            IO.println("Three's type: " + threeRestore.type());
            IO.println("Testing change after serialization of an object: " + oneRestore.type());
            IO.println("Testing change after serialization of an object: " + oneRestore.location());



//            IO.println("Four's type. Will cause EOFException ERROR exception: " + threeRestore.getType());


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
