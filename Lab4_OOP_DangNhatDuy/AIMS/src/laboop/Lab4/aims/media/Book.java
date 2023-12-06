package laboop.Lab4.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{  
    private List<String> authors;

    public Book(List<String> authors, int id, String title, String category, float cost) {
        super(id, title, category, cost);
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        // Check if the author is not already in the list
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author added: " + authorName);
        } else {
            System.out.println("Author already exists: " + authorName);
        }
    }
    
    public void removeAuthor(String authorName) {
        // Check if the author is in the list before removing
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed: " + authorName);
        } else {
            System.out.println("Author not found: " + authorName);
        }
    }  
       
    public List<String> getAuthors() {
        return authors;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        // Calculate content length
        int contentLength = super.getTitle().length() + super.getCategory().length();
        for (String author : authors) {
            contentLength += author.length();
        }

        return "Book{" +
                "id=" + super.getId() +
                ", title='" + super.getTitle() + '\'' +
                ", category='" + super.getCategory() + '\'' +
                ", authors=" + authors +
                ", contentLength=" + contentLength +
                '}';
    }

}


