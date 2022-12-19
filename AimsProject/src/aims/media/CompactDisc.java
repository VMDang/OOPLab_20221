package aims.media;

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

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track s){
        if (tracks.contains(s)){
            System.out.println("Cannot add track because existed");
        }else {
            tracks.add(s);
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
        return super.toString();
    }

    @Override
    public void play() {
        System.out.println("Playing : " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
        for (Track s:
             tracks) {
            s.play();
        }
    }
}
