package chapter8.video82;

public class Video implements Playable{
    private String title;
    private int   duration;

    public Video(String title,int duration) {
        this.title = title;
        this.duration =duration;
    }

    @Override
    public void play() {
        System.out.println("Play video:"+ this.title+ " duration "+ this.duration);
    }
    @Override
    public void pause() {
        System.out.println("Pause Video" + this.title);
    }
}
