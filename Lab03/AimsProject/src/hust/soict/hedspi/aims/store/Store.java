package hust.soict.hedspi.aims.store;

import java.util.ArrayList;
import hust.soict.hedspi.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("Added to store: " + media.getTitle());
        } else {
            System.out.println("Media already exists in store.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Removed from store: " + media.getTitle());
        } else {
            System.out.println("Media not found in store.");
        }
    }

    public Media search(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }

    public void displayStore() {
        System.out.println("************STORE*************");
        int index = 1;
        for (Media media : itemsInStore) {
            System.out.printf("%d. %s\n", index++, media.toString());
        }
        System.out.println("*****************************");
    }

    public void filterByTitle(String keyword) {
        for (Media media : itemsInStore) {
            if (media.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(media.toString());
            }
        }
    }

    public void filterById(int id) {
        for (Media media : itemsInStore) {
            if (media.getId() == id) {
                System.out.println(media.toString());
            }
        }
    }

    public boolean contains(Media media) {
        return itemsInStore.contains(media);
    }
}