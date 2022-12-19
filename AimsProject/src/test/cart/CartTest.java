package test.cart;

import aims.cart.Cart;
import aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",96 ,24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", "Guy Ritchie", 77,18.99f);
        cart.addDigitalVideoDisc(dvd3);

        cart.displayCart();
        cart.searchById(2);
        cart.searchByTitle("Aladin");
    }
}
