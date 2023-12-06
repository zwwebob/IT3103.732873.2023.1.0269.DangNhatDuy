package laboop.Lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import laboop.Lab4.aims.media.Book;
import laboop.Lab4.aims.media.CompactDisc;
import laboop.Lab4.aims.media.DigitalVideoDisc;
import laboop.Lab4.aims.media.Media;
import laboop.Lab4.aims.media.Track;



public class Aims {
    static Store store = new Store();
    public static void addstore(){
        store.addMedia(new Media(1, "Title1", "Category1", 10.0f));
        store.addMedia(new Media(2, "Title2", "Category2", 15.0f));
        store.addMedia(new Media(3, "Title3", "Category3", 20.0f));
    }
    public static void main(String[] args) {
        addstore();
        Cart anOrder = new Cart();
        String str;
        int op;
        Scanner scanner = new Scanner(System.in);
        showMenu();
        op = scanner.nextInt();
        while(true){       
            if(op == 1){
                storeMenu();
                op = scanner.nextInt();
                if(op == 0) break;
                else if(op == 1){
                    System.out.println("Enter title");
                    str = scanner.nextLine();
                    str = scanner.nextLine();
                    System.out.println(str);
                    SeeMediaDetail(str,anOrder);
                }
                else if(op == 2){
                    System.out.println("Enter title");
                    str = scanner.nextLine();
                    str = scanner.nextLine();
                    System.out.println(str);
                    AddMediaToCart(str, anOrder);
                }
            }
            else if( op == 2){
                //str = scanner.nextLine();
               // str = scanner.nextLine();
               // System.out.println(str);
                UpdateStore(); 
            }
            else if( op == 3){
                cartMenu();
                op = scanner.nextInt();
            }
            showMenu();
            op = scanner.nextInt();
        
        }
        scanner.close();
    }   
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }    
    
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    
    public static void SeeMediaDetail(String str,Cart cart){
        Media test = null,md= null;
         md = store.searchMediaByTitle(store,str);
        if(md == null){
            System.out.println("No film");
        }
        else{
            System.out.println(md);
            mediaDetailsMenu();
            Scanner s = new Scanner(System.in);
            int o = s.nextInt();
            if(o == 1){
                cart.addMedia(md);
            }
        }
    }
    
    public static void AddMediaToCart(String str,Cart cart){
        Media test = null,md= null;
        md = store.searchMediaByTitle(store,str);
        if(md == null){
            System.out.println("No film");
        }
        else{
            cart.addMedia(md);
        }
    }
    
    public static void UpdateStore(){
        System.out.println("1. Add store");
        System.out.println("2. Remove store");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a == 2){
            String str = s.nextLine();
            str = s.nextLine();
            System.out.println(str);
            Media md = store.searchMediaByTitle(store,str);
            if(md == null){
                System.out.println("No media");
            }
            else{
                store.removeMedia(md);
            }
        }
        else if( a == 1 ){
            System.out.println("The loai: 1.Book 2.CD 3.DVD");
            a = s.nextInt();
            
                // Get input for id
             System.out.print("Enter ID: ");
             int id = s.nextInt();
             // Consume the newline character left in the buffer
             s.nextLine();
           // Get input for title
             System.out.print("Enter Title: ");
             String title = s.nextLine();
             // Get input for category
             System.out.print("Enter Category: ");
             String category = s.nextLine();
             // Get input for cost
             System.out.print("Enter Cost: ");
             float cost = s.nextFloat();
             s.nextLine();
            
             if(a==1){
                    System.out.print("Enter Authors (comma-separated): ");
                   String authorsInput = s.nextLine();

                   // Convert the comma-separated input to a List<String>
                   List<String> authors = new ArrayList<>();
                   String[] authorArray = authorsInput.split(",");
                   for (String author : authorArray) {
                       authors.add(author.trim());
                   }
                   Book book = new Book(authors,id,title,category,cost);
                   System.out.println(book);
                   store.addMedia(book);
             }
             else if( a== 2){
                 System.out.print("Enter Artist: ");
                String artist = s.nextLine();
                System.out.print("Enter director: ");
                String director = s.nextLine();
                System.out.print("Enter length: ");
                int length = s.nextInt();                // Consume the newline character left in the buffer
                s.nextLine();
                 // Get input for the number of tracks in the album
                System.out.print("Enter the number of tracks: ");
                int numTracks = s.nextInt();                // Consume the newline character left in the buffer
                s.nextLine();                // Create an ArrayList to store Track objects
                ArrayList<Track> tracks = new ArrayList<>();
                // Get input for each track
                for (int i = 1; i <= numTracks; i++) {
                    System.out.println("Enter details for Track " + i + ":");          // Get input for track title
                    System.out.print("  Enter Track Title: ");
                    String tracktitle = s.nextLine();                   // Get input for track length
                    System.out.print("  Enter Track Length (in seconds): ");
                    int tracklength = s.nextInt();  // Consume the newline character left in the buffer
                    s.nextLine();
                    // Create a Track object and add it to the tracks ArrayList
                    Track track = new Track(tracktitle, tracklength);
                    tracks.add(track);
                }
                
                CompactDisc cd = new CompactDisc(artist,tracks,length,director,id,title,category,cost);
                 System.out.println(cd);
                store.addMedia(cd);//them media
             }
             else if ( a == 3){
                System.out.print("Enter director: ");
                String director = s.nextLine();
                System.out.print("Enter length: ");
                int length = s.nextInt();                // Consume the newline character left in the buffer
                s.nextLine();
                DigitalVideoDisc dvd = new DigitalVideoDisc(length,director,id,title,category,cost);
                store.addMedia(dvd);//them media
             }
        }
    }
}