package laboop.Lab4.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc(int length, String director, int id, String title, String category, float cost) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
    
}