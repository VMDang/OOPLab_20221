package aims.cart;

import aims.media.DigitalVideoDisc;
import aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media){
        itemsOrdered.add(media);
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
//    public void searchByTitle(String title) {
//        boolean matched = false;
//        for(int i = 0 ;i<qtyOrdered;i++) {
//            if(DigitalVideoDisc.isMatch(itemsOrdered[i], title) ) {
//                System.out.println(itemsOrdered[i].toString());
//                matched = true;
//            }
//        }
//        if(matched == false) System.out.println("No DVD match");
//    }

//    public void searchById(int id) {
//        boolean matched = false;
//        for(int i = 0 ;i<qtyOrdered;i++) {
//            if(DigitalVideoDisc.isMatch(itemsOrdered[i], id) ) {
//                System.out.println(itemsOrdered[i].toString());
//                matched = true;
//            }
//        }
//        if(matched == false) System.out.println("No DVD match");
//    }
}
