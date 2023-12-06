package laboop.Lab4;

import java.util.ArrayList;
import java.util.List;

public class CD {
    private int id;
    private String title;
    private String category;
    private String artist;
    private String director;
    private List<Track> trackList ;
    private float price;

    // Constructor
    public CD(int id, String title, String category, String artist, String director, List<Track> trackList, float price) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.artist = artist;
        this.director = director;
        this.trackList = trackList;
        this.price = price;
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

    public String getArtist() {
        return artist;
    }

    public String getDirector() {
        return director;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public double getPrice() {
        return price;
    }

    // Method to calculate the total length of the CD
    public double getTotalLength() {
        double totalLength = 0;
        for (Track track : trackList) {
            totalLength += track.getTrackLength();
        }
        return totalLength;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        // CD information
        stringBuilder.append("CD{\n")
                .append("  title='").append(title).append("',\n")
                .append("  category='").append(category).append("',\n")
                .append("  artist='").append(artist).append("',\n")
                .append("  director='").append(director).append("',\n")
                .append("  totalLength=").append(getTotalLength()).append(",\n")
                .append("  price=").append(price).append(",\n")
                .append("  tracks=[\n");

        // Track information
        for (Track track : trackList) {
            stringBuilder.append("    ").append(track.toString()).append(",\n");
        }

        stringBuilder.append("  ]\n")
                .append("}\n");

        return stringBuilder.toString();
    }

    // Nested Track class
    public static class Track {
        private String trackTitle;
        private double trackLength;

        // Constructor for Track
        public Track(String trackTitle, double trackLength) {
            this.trackTitle = trackTitle;
            this.trackLength = trackLength;
        }

        // Getter methods for Track
        public String getTrackTitle() {
            return trackTitle;
        }

        public double getTrackLength() {
            return trackLength;
        }

        // toString method for easy printing of Track
        @Override
        public String toString() {
            return "Track{" +
                    "trackTitle='" + trackTitle + '\'' +
                    ", trackLength=" + trackLength +
                    '}';
        }
    }

}