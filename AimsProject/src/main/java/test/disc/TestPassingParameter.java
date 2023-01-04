package test.disc;

import aims.media.DigitalVideoDisc;

import java.util.Collections;
import java.util.ArrayList;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);

        ArrayList <DigitalVideoDisc> list = new ArrayList<DigitalVideoDisc>();
        list.add(jungleDVD);
        list.add(cinderellaDVD);

        swap(jungleDVD, cinderellaDVD);     //swap false
        Collections.swap(list, 0, 1);

        System.out.println("Jungle DVD Title: " + list.get(0).getTitle());
        System.out.println("Cinderella DVD Title: " + list.get(1).getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle DVD Title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc();
        dvd.setTitle(oldTitle);
    }
}
