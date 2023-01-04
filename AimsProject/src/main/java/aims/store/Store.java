package aims.store;

import aims.media.DigitalVideoDisc;
import aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private static final int MAX_ITEMS = 100;
    private List<Media> itemsInStore = new ArrayList<Media>();

    public List<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void addMedia(Media media){
        if (itemsInStore.size() >= MAX_ITEMS){
            System.out.println("Store is overflow");
        }else{
            itemsInStore.add(media);
            System.out.println("The disc " + media.getTitle() + " has been added");
        }
        return;
    }

    public void removeMedia(Media media){
        if (itemsInStore.isEmpty()){
            System.out.println("Store is emty");
        }else {
            itemsInStore.remove(media);
            System.out.println("The media " + media.getTitle() + " has been removed");
        }
        return;
    }
    public void displayStore(){
        for (Media media:
             itemsInStore) {
            System.out.println(media.toString());
        }
    }

    public Media searchByTitle(String title) {
        for(Media m : itemsInStore) {
            if (m.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return m;
            }
        }
        return null;
    }
}
