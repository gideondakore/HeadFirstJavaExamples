package com.amalitech.headfirstjava;

public class Songv3 implements Comparable<Songv3> {
    private String tittle;
    private String artist;
    private int bpm;

    @Override
    public int compareTo(Songv3 s){
        IO.println("This Comparable was used ");
        return tittle.compareTo(s.getTittle());
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        Songv3 song = (Songv3) obj;
        return tittle.equals(song.tittle);
    }

    @Override
    public int hashCode(){
        return tittle.hashCode();
    }



    Songv3(String title, String artist, int bpm){
        this.tittle = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTittle(){
        return tittle;
    }

    public String getArtist(){
        return artist;
    }

    public int getBpm(){
        return bpm;
    }

    @Override
    public String toString(){
        return tittle;
    }
}
