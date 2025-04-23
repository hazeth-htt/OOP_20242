package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, director, length);
    }

    public DigitalVideoDisc(String title) {
        super(title, "Unknown", 0.0f, "Unknown", 0);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("Length: " + getLength() + " minutes");
    }
    
    @Override
    public String toString()
    {
    	return String.format("DVD - %s - %s -%s - %d: $%.2f",
    			getTitle(), getCategory(), getDirector(), getLength(), getCost());
}
}

    
