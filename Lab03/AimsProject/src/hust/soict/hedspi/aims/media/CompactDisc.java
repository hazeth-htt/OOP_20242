package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, float cost, String director, int length, String artist) {
        super(title, category, cost, director, length);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) tracks.add(track);
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    public int getLength() {
        return tracks.stream().mapToInt(Track::getLength).sum();
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + getTitle());
        System.out.println("Artist: " + artist);
        for (Track track : tracks) track.play();
    }
    @Override
    public String toString()
    {
    	return String.format("CD - %s - %s - %s - %d: $%.2f",
    			getTitle(), getCategory(), getDirector(), getLength(), getCost());
}
}