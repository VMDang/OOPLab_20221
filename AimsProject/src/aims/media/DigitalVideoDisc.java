package aims.media;

public class DigitalVideoDisc extends Disc {
    private static int nbDigitalVideoDiscs=0;

    public DigitalVideoDisc() {
        super();
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
        DigitalVideoDisc.nbDigitalVideoDiscs += 1;
        setId(DigitalVideoDisc.nbDigitalVideoDiscs);
    }

    public String toString() {
        return ("DVD - "  +   this.getId()+" - "
                        +   this.getTitle()+" - "
                        +   (this.getCategory()== null ? "null" : this.getCategory()) + " - "
                        +   (this.getDirector()== null ? "null" : this.getDirector()) + " - "
                        +   (this.getLength()== 0 ? " null" : this.getLength()) + ": "
                        +   this.getCost() + "$");
    }

    public static boolean isMatch(DigitalVideoDisc dvd, String title){
        if (dvd.getTitle() == title){
            return true;
        }else return false;
    }

    public static boolean isMatch(DigitalVideoDisc dvd, int id){
        if (dvd.getId() == id){
            return true;
        }else return false;
    }

}
