package laboop.Lab4.aims.media;

public class Track implements Playable{
    private String title;
   private int length;

   // Constructor with title and length parameters
   public Track(String title, int length) {
       this.title = title;
       this.length = length;
   }

   public String getTitle() {
       return title;
   }

   public int getLength() {
       return length;
   }

   @Override
   public String toString() {
       return "Track{" + "title=" + title + ", length=" + length + '}';
   }

   
   
   @Override
   public void play() {
       System.out.println("Playing DVD: " + this.getTitle());
       System.out.println("DVD length: " + this.getLength());
   }
}