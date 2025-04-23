package hust.soict.hedspi.aims.test.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd = new DigitalVideoDisc("Test DVD", "Test", "Test Director", 60, 10.0f);
        cart.addMedia(dvd);
        cart.displayCart();
    }
}