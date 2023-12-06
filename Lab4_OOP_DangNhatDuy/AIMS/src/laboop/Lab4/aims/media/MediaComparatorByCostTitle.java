package laboop.Lab4.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media media1, Media media2) {
        // Compare by cost
        int costComparison = Float.compare(media1.getCost(), media2.getCost());

        if (costComparison != 0) {
            // If costs are not equal, return the cost comparison result
            return costComparison;
        } else {
            // If costs are equal, compare by title
            return media1.getTitle().compareTo(media2.getTitle());
        }
    }
}