public class Aims {
    public static void main(String[] args) {
        Cart list = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);

        list.addDigitalVideoDisc(dvd1);
        list.addDigitalVideoDisc(dvd2);
        list.addDigitalVideoDisc(dvd3);

        System.out.printf("\nNumber of ordered : %d \n", list.getQtyOrdered());
        System.out.println("Information DVD: ");
        list.displayCart();

        list.removeDigitalVideoDisc(dvd2);
        System.out.printf("\n Number of ordered after remove : %d \n", list.getQtyOrdered());
        System.out.println("Information DVD : ");
        list.displayCart();


    }
}
