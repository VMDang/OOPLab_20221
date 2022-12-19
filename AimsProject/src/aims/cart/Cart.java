package aims.cart;

import aims.media.Book;
import aims.media.CompactDisc;
import aims.media.DigitalVideoDisc;
import aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    private List<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media){
        if (!itemsOrdered.contains(media)){
            itemsOrdered.add(media);
            System.out.println("The media " + media.getTitle() + " has been added");
        }
        else System.out.println("The media cannot add because existed");
    }

    public List<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public void removeMedia(Media media){
        if (itemsOrdered.isEmpty()){
            System.out.println("Cart is emty");
        }else {
            itemsOrdered.remove(media);
        }
        return;
    }

    public double totalCost(){
        double total = 0;
        for (Media media:
             itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void displayCart(){
        double total = totalCost();

        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (Media media:
             itemsOrdered) {
            int i=0;
            System.out.println((++i) + ". " + media.toString());
        }
        System.out.printf("Total cost: %.2f $\n",total);
        System.out.println("***************************************************");
    }

    public void playMedia(Media media) {
        if (media instanceof CompactDisc) {
            ((CompactDisc) media).play();
        }
        if (media instanceof DigitalVideoDisc) {
            ((DigitalVideoDisc) media).play();
        }
        if (media instanceof Book) {
            System.out.println("Book cannot play");
        }
    }
    public Media searchByTitle(String title) {
        for(Media m : itemsOrdered) {
            if (m.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return m;
            }
        }
        return null;
    }

    public Media searchById(int id) {
        for(Media m : itemsOrdered) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }
}
