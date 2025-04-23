package lab02;

public class Aims {
	public static void main(String[] args)
	{
		  Cart cart = new Cart();

	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Guy Ritchie", 90, 18.99f);

	        cart.addDigitalVideoDisc(dvd1);
	        cart.addDigitalVideoDisc(dvd2, dvd3); // method overloading

	        cart.displayCart();

	        cart.removeDigitalVideoDisc(dvd2);

	        cart.displayCart();
	        System.out.println("ID of dvd1: " + dvd1.getId());
	        System.out.println("ID of dvd2: " + dvd2.getId());
	        System.out.println("ID of dvd3: " + dvd3.getId());

		
	}
}
