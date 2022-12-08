public class Store {
    private static final int MAX_ITEMS = 100;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_ITEMS];
    private int qtyItemStore = 0;

    public int getQtyItemStore() {
        return qtyItemStore;
    }

    public void setQtyItemStore(int qtyItemStore) {
        this.qtyItemStore = qtyItemStore;
    }

    public void displayStore(){
        for (int i = 0; i < qtyItemStore; i++) {
            System.out.println(itemsInStore[i].toString());
        }
    }

    public void addDVD(DigitalVideoDisc dvd){
        if (qtyItemStore == MAX_ITEMS){
            System.out.println("The store is almost full");
            return;
        }else {
            itemsInStore[qtyItemStore] = dvd;
            setQtyItemStore(qtyItemStore+1);
            System.out.println("The DVD" + dvd.getTitle() + " has been added");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd){
        if (qtyItemStore == 0) {
            System.out.println("Store is emty");
            return;
        }

        int i = 0;
        while (i < qtyItemStore){
            if (dvd.equals(itemsInStore[i])){
                for (int j = i; j < qtyItemStore; j++) {
                    itemsInStore[j] = itemsInStore[j+1];
                }

                setQtyItemStore(qtyItemStore-1);
            }
            i++;
        }
        System.out.println("The DVD " + dvd.getTitle() + " has been removed");
    }
}
