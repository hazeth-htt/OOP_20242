package hust.soict.hedspi.aims.test.PolymorphismTest;

import hust.soict.hedspi.aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismTest {
    public static void main(String[] args) {
        List<Media> mediaList = new ArrayList<>();

        DigitalVideoDisc dvd = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Nolan", 169, 30.0f);
        Book book = new Book("Clean Code", "Programming", 20.5f);
        book.addAuthor("Robert C. Martin");
        CompactDisc cd = new CompactDisc("Taylor's Hits", "Pop", 25.0f, "Producer", 12, "Taylor Swift");

        mediaList.add(cd);
        mediaList.add(dvd);
        mediaList.add(book);

        for (Media m : mediaList) {
            System.out.println(m.toString()); // polymorphism in action
        }
    }
}