package laboop.Lab4;

import java.util.ArrayList;
import laboop.Lab4.aims.media.DigitalVideoDisc;
import static laboop.Lab4.Cart.MAX_NUMBERS_ORDERED;
import laboop.Lab4.aims.media.Media;

public class Store {
    public static final int MAX_NUMBERS_STORE = 50;
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media me){	//them 1 media
        itemsInStore.add(me);
    }
    
    public void removeMedia(Media me){//xoa 1 media
        itemsInStore.remove(me);
    }
     public static Media searchMediaByTitle(Store store, String title) {
            for (Media media : store.itemsInStore) {
                if (media.getTitle().equals(title)) {
                    return media; // Found the media with the specified title
                }
            }
            return null; // Media with the specified title not found
    }
    
}