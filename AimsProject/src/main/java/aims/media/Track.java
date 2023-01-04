package aims.media;

import aims.exception.PlayerException;

import javax.swing.*;
import java.awt.*;

public class Track implements Playable{
    private String title;
    private int length;

    public Track() {
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() throws PlayerException {
        if(this.getLength() > 0){
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
            JFrame f = new JFrame();
            f.setSize(400, 400);
            JDialog d = new JDialog(f, "Playing disc...");
            d.setLayout(new FlowLayout());
            d.add(new JLabel("Playing DVD: " + this.getTitle()));
            d.add(new JLabel("DVD length: " + this.getLength()));
        }
        else {
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Track track = (Track) o;

        return title == track.title && length == track.length;
    }

}
