package laboop.Lab4;

import java.util.ArrayList;
import java.util.List;
import laboop.Lab4.aims.media.CompactDisc;
import laboop.Lab4.aims.media.Media;
import laboop.Lab4.aims.media.Track;

/**
 *
 * @author Admin
 */
public class Test {
     public static void main(String[] args) {
        // Creating a list of tracks for the CD
        ArrayList<Media> store = new ArrayList<>();
        ArrayList<Track> trackList = new ArrayList<>();
        trackList.add(new Track("Track 1", 4));
        trackList.add(new Track("Track 2", 3));
        trackList.add(new Track("Track 3", 5));

        // Creating a new CD object
        CompactDisc cdExample = new CompactDisc(
                "Duy",
                trackList,
                1,
                "Awesome Album",
                2,
                "Artist Name",
                "Director Name",
                
                19.99f
        );
        
        CompactDisc cdExample2 = new CompactDisc(
                "Duy2",
                trackList,
                11,
                "1Awesome Album",
                22,
                "1Artist Name",
                "D2irector Name",
                
                34.99f
        );
        
        // Displaying the CD information using toString
        Media md = (Media)cdExample;
        System.out.println(cdExample.toString());
        
        store.add(cdExample); store.add(cdExample2);
        store.add(new Media(1, "Title1", "Category1", 10.0f));
        store.add(new Media(2, "Title2", "Category2", 15.0f));
        store.add(new Media(3, "Title3", "Category3", 20.0f));
        
        
        Cart cart = new Cart();
        cart.addMedia(cdExample);
        cart.addMedia(cdExample2);
        CompactDisc cd = (CompactDisc)(Media)cdExample;
         System.out.println("");
         System.out.println(cd);
        cart.prin();
         System.out.println(cart.totalCost());
    }
}