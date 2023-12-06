package laboop.Lab4;

import laboop.Lab4.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
       // DigitalVideoDisc jungleDVD = new DigitalVideoDisc ("Jungle"); 
       // DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc ("Cinderella");
//        swap(jungleDVD, cinderellaDVD);
//        System.out.println("jungle dvd title: " + jungleDVD.getTitle()); 
//        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
//        changeTitle(jungleDVD, cinderellaDVD.getTitle());
//        System.out.println("jungle dvd title:" + jungleDVD.getTitle());
    }
    public static void swap (Object o1, Object o2) {
        String s1 = ((DigitalVideoDisc)o1).getTitle();
        ((DigitalVideoDisc)o1).setTitle(((DigitalVideoDisc)o2).getTitle());
        ((DigitalVideoDisc)o2).setTitle(s1);
        
}
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        //dvd = new DigitalVideoDisc (oldTitle);
    }
}