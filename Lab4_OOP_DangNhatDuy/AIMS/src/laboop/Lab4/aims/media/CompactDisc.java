package laboop.Lab4.aims.media;


import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc(String artist, ArrayList<Track> tracks, int length, String director, int id, String title, String category, float cost) {
        super(length, director, id, title, category, cost);
        this.artist = artist;
        this.tracks = tracks;
    }
    
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added successfully: " + track.getTitle());
        } else {
            System.out.println("Track already exists in the CD: " + track.getTitle());
        }
    }
     public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed successfully: " + track.getTitle());
        } else {
            System.out.println("Track not found in the CD: " + track.getTitle());
        }
    }
    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    
    
    public String getArtist() {
        return artist;
    }

    @Override
    public void play() {
        for (Track track : tracks){
            track.play();
        }
    }

    @Override
    public String toString() {
        return "CompactDisc{" + "artist=" + artist + ", tracks=" + tracks + '}';
    }
    
    
    
   
    
}