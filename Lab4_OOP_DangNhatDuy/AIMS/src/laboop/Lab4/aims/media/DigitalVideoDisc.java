package laboop.Lab4.aims.media;

import java.util.*;


public class DigitalVideoDisc extends Disc implements Playable{ 
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(int length, String director, int id, String title, String category, float cost) {
        super(length, director, id, title, category, cost);
    }

    public void info(){
        System.out.println(super.getTitle()+" "+super.getCategory()+" "+super.getDirector()+" "+super.getCost()+" "+nbDigitalVideoDiscs);
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); 
    }    

    @Override
    public String toString() {
        final StringJoiner joiner = new StringJoiner(" - ",  "DVD - ", "");
        joiner.add("" + super.getTitle() + "");
        joiner.add("" + super.getCategory() + "");
        if (super.getDirector() != null) {
            joiner.add("" + super.getDirector() + "");
        }
        if (super.getLength() != 0) {
            joiner.add("" + super.getLength() + "");
        }
        joiner.add("" + super.getCost() + "");
        return joiner.toString();
    }   

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());  
        System.out.println("DVD length: " + this.getLength());
    }

}
