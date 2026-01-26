package com.amalitech.headfirstjava.game;

import java.io.*;

public class GameSaverTest {
    public static void main(String[] args){
        GameCharacter one = new GameCharacter(50, "Elf", new String[]{"bow", "sword", "dust"}, 23);

        GameCharacter two = new GameCharacter(200, "Troll", new String[]{"bare", "hands", "big ax"}, 24);

        GameCharacter three = new GameCharacter(120, "Magician", new String[]{"spells", "invisibility"}, 25);
        GameCharacter four = new GameCharacter(120, "Magician", new String[]{"spells", "invisibility"}, 26);


        IO.println(three.equals(four));

        try{

            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }

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


//            IO.println("Four's type. Will cause EOFException ERROR exception: " + threeRestore.getType());


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
