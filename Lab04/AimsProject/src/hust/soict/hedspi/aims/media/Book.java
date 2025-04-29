package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<>();

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public void addAuthor(String author) {
        if (!authors.contains(author)) authors.add(author);
    }

    public void removeAuthor(String author) {
        authors.remove(author);
    }

    @Override
    public String toString()
    {
    	return String.format("Book - %s - %s - $%.2f - Authors: %s",
    			getTitle(), getCategory(), getCost(), String.join(", ", authors));
}
    
}
