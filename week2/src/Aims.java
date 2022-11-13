public class Aims {
    public static void main(String[] args) {
        Cart list = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("John Wick", "action", "Adam Smith", 4, 15.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Shin", "animation", "Tanaka", 99, 6.6f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Avenger", "Science Fiction", "Marvel", 5, 30f);

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
