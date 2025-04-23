package lab02;
import java.util.ArrayList;
public class Cart {
	 public static final int MAX_NUMBERS_ORDERED = 20;
	    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

	    // Overloaded add methods
	    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
	        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
	            itemsOrdered.add(disc);
	            System.out.println("Added: " + disc.getTitle());
	        } else {
	            System.out.println("The cart is full.");
	        }
	    }

	    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
	        for (DigitalVideoDisc disc : dvdList) {
	            addDigitalVideoDisc(disc);
	        }
	    }

	    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	        addDigitalVideoDisc(dvd1);
	        addDigitalVideoDisc(dvd2);
	    }

	    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	        if (itemsOrdered.remove(disc)) {
	            System.out.println("Removed: " + disc.getTitle());
	        } else {
	            System.out.println("Disc not found in cart.");
	        }
	    }

	    public float totalCost() {
	        float total = 0;
	        for (DigitalVideoDisc disc : itemsOrdered) {
	            total += disc.getCost();
	        }
	        return total;
	    }

	    public void displayCart() {
	        System.out.println("Cart contents:");
	        int index = 1;
	        for (DigitalVideoDisc disc : itemsOrdered) {
	            System.out.println(index + ". " + disc.getTitle() + " - $" + disc.getCost());
	            index++;
	        }
	        System.out.printf("Total cost: $%.2f\n", totalCost());
	    }
}
