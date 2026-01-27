package chapter8.video82;

public class Video82 {
    public static void main(String[] args) {
        Song mySong = new Song(" Không cảm xúc"," Hồ Quang Hiéu");
        Video myVideo = new Video("Hoàng Anh", 1000);

        Playable[] list = {myVideo, mySong};
        for (Playable hihi : list){
           hihi.pause();
           hihi.play();
        }
    }
}
