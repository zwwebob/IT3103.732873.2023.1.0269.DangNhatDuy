package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;


public class StoreTest {
    public static void main(String[] args) {
        // Create a store
        Store store = new Store();

        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD1", "Category1", "Director1", 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD2", "Category2", "Director2", 24.99f);

        // Test addDVD method
        store.addDVD(dvd1);
        store.addDVD(dvd2);

        // Display items in the store after adding DVDs
        System.out.println("Items in the store after adding DVDs:");
        displayItems(store.getItemsInStore());

        // Test removeDVD method
        store.removeDVD(dvd1);

        // Display items in the store after removing a DVD
        System.out.println("Items in the store after removing a DVD:");
        displayItems(store.getItemsInStore());
    }

    // Helper method to display items
    private static void displayItems(DigitalVideoDisc[] items) {
        for (DigitalVideoDisc dvd : items) {
            if (dvd != null) {
                System.out.println(dvd);
            }
        }
    }
}