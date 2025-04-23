package hust.soict.hedspi.aims.test.disc;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd = new DigitalVideoDisc("Example", "Category", "Director", 120, 20.0f);
        dvd.play();
    }
}