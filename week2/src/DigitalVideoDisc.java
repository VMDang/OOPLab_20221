public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDiscs=0;

    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        DigitalVideoDisc.nbDigitalVideoDiscs += 1;
        this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        DigitalVideoDisc.nbDigitalVideoDiscs += 1;
        this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        DigitalVideoDisc.nbDigitalVideoDiscs += 1;
        this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        DigitalVideoDisc.nbDigitalVideoDiscs += 1;
        this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
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
