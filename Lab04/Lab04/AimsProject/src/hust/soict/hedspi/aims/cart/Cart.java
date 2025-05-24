package hust.soict.hedspi.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("Added: " + media.getTitle());
        }
    }

    public void removeMedia(Media media) {
        itemsOrdered.remove(media);
        System.out.println("Removed: " + media.getTitle());
    }

    public void removeByTitle(String title) {
        itemsOrdered.removeIf(m -> m.getTitle().equalsIgnoreCase(title));
    }

    public Media findByTitle(String title) {
        for (Media m : itemsOrdered) {
            if (m.getTitle().equalsIgnoreCase(title)) return m;
        }
        return null;
    }

    public void filterByTitle(String keyword) {
        for (Media m : itemsOrdered) {
            if (m.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(m.toString());
            }
        }
    }

    public void filterById(int id) {
        for (Media m : itemsOrdered) {
            if (m.getId() == id) {
                System.out.println(m.toString());
            }
        }
    }

    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }

    public void clear() {
        itemsOrdered.clear();
        System.out.println("Cart is now empty.");
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("************CART*************");
        System.out.println("Ordered Items:");

        int index = 1;
        for (Media media : itemsOrdered) {
            if (media instanceof DigitalVideoDisc) {
                DigitalVideoDisc dvd = (DigitalVideoDisc) media;
                System.out.printf("%d. DVD - %s - %s - %s - %d: %.2f $\n",
                        index++,
                        dvd.getTitle(),
                        dvd.getCategory(),
                        dvd.getDirector(),
                        dvd.getLength(),
                        dvd.getCost());
            } else {
                System.out.printf("%d. %s\n", index++, media.toString());
            }
        }

        System.out.printf("Total cost: %.2f $\n", totalCost());
        System.out.println("*****************************");
    }

    public void playAll() {
        for (Media media : itemsOrdered) {
            if (media instanceof Playable) {
                ((Playable) media).play();
            }
        }
    }
}