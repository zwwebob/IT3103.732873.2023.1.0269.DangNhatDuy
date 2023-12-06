package laboop.Lab4.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

    @Override
    public int compare(Media media1, Media media2) {
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());

        if (titleComparison != 0) {
            // If titles are not equal, return the title comparison result
            return titleComparison;
        } else {
            // If titles are equal, compare by cost
            return Float.compare(media1.getCost(), media2.getCost());
        }
    }
}