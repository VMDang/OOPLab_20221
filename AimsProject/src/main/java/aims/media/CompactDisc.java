package aims.media;

import aims.exception.PlayerException;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String category, String director, int length, float cost, String artist, List<Track> tracks) {
        super(title, category, director, length, cost);
        this.artist = artist;
        this.tracks = tracks ;
    }

    public CompactDisc(String title, String category, String director, String artist, float cost) {
        setTitle(title);
        setCategory(category);
        setDirector(director);
        setCost(cost);
        this.artist = artist;

    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track s){
        if (tracks.contains(s)){
            System.out.println("Cannot add track because existed");
        }else {
            tracks.add(s);
            System.out.println("The track has been added");
        }
        return;
    }

    public void removeTrack(Track s){
        if (!tracks.contains(s)){
            System.out.println("Cannot remove track because not exist");
        }else {
            tracks.remove(s);
        }
        return;
    }

    public int getLength(){
        int CDlength = 0;
        for (Track s:
             tracks) {
            CDlength += s.getLength();
        }

        return CDlength;
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "id=" + getId() +
                ", title=" + getId() +
                ", category=" + getCategory() +
                ", director=" + getDirector() +
                ", artist=" + artist +
                ", tracks=" + tracks +
                ", length=" + getLength() +
                ", cost=" + getCost() + '$' +
                '}';
    }

    @Override
    public void play() throws PlayerException {
        System.out.println("Playing : " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
        for (Track s:
             tracks) {
            s.play();
        }
    }
}
