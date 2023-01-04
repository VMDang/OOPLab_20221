package aims.media;

import aims.exception.PlayerException;

import javax.swing.*;

public class DigitalVideoDisc extends Disc implements Playable{
    private static int nbDigitalVideoDiscs=0;

    public DigitalVideoDisc() {
        super();
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
        DigitalVideoDisc.nbDigitalVideoDiscs += 1;
        setId(DigitalVideoDisc.nbDigitalVideoDiscs);
    }

    @Override
    public String toString() {
        return super.toString();
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

    @Override
    public void play() throws PlayerException {
        if(this.getLength() > 0){
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
            JFrame f = new JFrame();
            f.setSize(400,200);
            JDialog d = new JDialog(f, "Playing disc...");

        }
        else {
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }
    }
}
