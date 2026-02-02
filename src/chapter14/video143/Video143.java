package chapter14.video143;

public class Video143 {
    public static void main(String[] args) {
        System.out.println("Video 143");
        MyFirstThread FT = new MyFirstThread("Hoàng Anh 1:");
        FT.start();
        MyScondThread st = new MyScondThread("hoàng anh 2:");
        st.start();
    }
}
