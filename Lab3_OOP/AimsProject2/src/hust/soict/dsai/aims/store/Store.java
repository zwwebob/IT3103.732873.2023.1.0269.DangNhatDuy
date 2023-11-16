package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;


public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int itemCount;
     private static final int MAX_ITEMS = 9999;
     public Store() {
        itemsInStore = new DigitalVideoDisc[MAX_ITEMS];
        itemCount = 0;
    }

    public DigitalVideoDisc[] getItemsInStore() {
        return itemsInStore;
    }

    public void setItemsInStore(DigitalVideoDisc[] itemsInStore) {
        this.itemsInStore = itemsInStore;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
    public void addDVD(DigitalVideoDisc dvd){
        if (itemCount < MAX_ITEMS) {
            itemsInStore[itemCount] = dvd;
            itemCount++;
            System.out.println("DVD has added to the store: " + dvd.getTitle());
        } else {
            System.out.println("Store is full.Cannot add");
        }
    }
    
    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (itemsInStore[i] == dvd) {
                for (int j = i; j < itemCount - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[itemCount - 1] = null;
                itemCount--;
                System.out.println("DVD removed from the store: " + dvd.getTitle());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("DVD not found in the store: " + dvd.getTitle());
        }
    }
}