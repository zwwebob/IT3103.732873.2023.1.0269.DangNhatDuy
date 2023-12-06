package laboop.Lab4.aims.media;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
//import laboop.Lab02.Store;

public class Media extends Object{
    private int id;
    private String title;
    private String category;
    private float cost;

    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    
    public static void main(String[] args) {
        List<Media> collection = new ArrayList<>();
        java.util.Collections.sort(collection,COMPARE_BY_TITLE_COST);
        java.util.Collections.sort(collection,COMPARE_BY_COST_TITLE);
    }
    
    // Constructors
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

//    public static Media searchMediaByTitle(Store store, String title) {
//            for (Media media : store.i) {
//                if (media.getTitle().equals(title)) {
//                    return media; // Found the media with the specified title
//                }
//            }
//            return null; // Media with the specified title not found
//    }

    
    
    
    @Override
    public String toString() {
        return "Media{" + "id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + '}';
    }

    
    
    // Getter methods
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    // Setter methods (if needed)
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Other methods or functionality can be added as needed
}
