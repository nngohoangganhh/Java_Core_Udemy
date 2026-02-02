package chapter14.video144;

public class Video144 {
    public static void main(String[] args) {
        System.out.println("video144");
        HoangAnh test = new HoangAnh();
      //  Thread thread = new Thread(test);
       // thread.start();
        Thread mythread = new Thread( () -> {System.out.println("HUHU");});
        mythread.start();

    }
}
