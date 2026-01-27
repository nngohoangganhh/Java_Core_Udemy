package chapter8.video82;

import java.awt.font.TextHitInfo;

public class Song implements Playable{
    private String title;
    private String artist;


    public Song(String title, String artist) {
        this.artist= artist;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("PLAY SONG : "+ this.title+  " by : "+ this.artist);
    }

    @Override
    public void pause() {
        System.out.println("Pause :"+this.title);
    }
}
