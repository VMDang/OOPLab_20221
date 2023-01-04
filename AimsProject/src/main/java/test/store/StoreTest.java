package test.store;

import aims.media.DigitalVideoDisc;
import aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store st = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", "Guy Ritchie", 77,18.99f);

        st.addMedia(dvd1);
        st.addMedia(dvd2);
        st.addMedia(dvd3);

        System.out.println("The store before remove:");
        st.displayStore();

        st.removeMedia(dvd2);
        System.out.println("The store after remove:");
        st.displayStore();
    }
}
