package hust.soict.hedspi.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() { return title; }
    public int getLength() { return length; }

    @Override
    public String play() {
        return "Playing DVD: " + this.getTitle() + "\nDVD length: " + this.getLength() + " minutes.";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Track)) return false;
        Track other = (Track) obj;
        return title.equalsIgnoreCase(other.title) && length == other.length;
    }
}