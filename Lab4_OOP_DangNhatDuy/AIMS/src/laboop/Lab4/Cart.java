package laboop.Lab4;

import java.util.ArrayList;
import laboop.Lab4.aims.media.DigitalVideoDisc;
import java.util.Arrays;
import laboop.Lab4.aims.media.Media;

public class Cart {
    private double cost=0;//tong tien
    public static final int MAX_NUMBERS_ORDERED = 20;//max maeia
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    
    public void addMedia(Media me){//them media
        if(!itemsOrdered.contains(me)){
            itemsOrdered.add(me);
            System.out.println("Track added successfully: " + me.getTitle());
            System.out.println("Cart Size "+itemsOrdered.size());
        } else {
            System.out.println("Track already exists in the CD: " + me.getTitle());
        }
        
    }
   
    public void removeMedia(Media me){	//ham xoa media
        if(itemsOrdered.contains(me)){
            itemsOrdered.remove(me);
            System.out.println("Track removed successfully: " + me.getTitle());
        }
        
    }
    
    public void prin(){//in ra thong tin
        for(Media md : itemsOrdered){
            System.out.println(md.toString());	// in ra thong tin cua tung media
        }
    }
    
    public double totalCost(){
        double cost=0;//tao loop
        for(Media md : itemsOrdered){	
            cost += md.getCost();
        }
        return cost;        //tra ve tong tien
    }
    
   
}