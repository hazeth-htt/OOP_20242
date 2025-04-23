package hust.soict.hedspi.aims.media;
import java.util.Comparator;

public abstract class Media {
    private static int nbMedia = 0;
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbMedia;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public float getCost() { return cost; }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Media)) return false;
        Media other = (Media) obj;
        return this.title.equalsIgnoreCase(other.title);
    }

    @Override
    public String toString() {
        return String.format("%s - %s - $%.2f", getTitle(), getCategory(), getCost());
    }
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

}
