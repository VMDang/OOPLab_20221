package aims.media;

public class Disc extends Media{
    private String director;
    private int length;

    public Disc() {

    }

    public Disc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Disc{" +
                "director='" + director + '\'' +
                super.toString() +
                ", length=" + length +
                '}';
    }
}
