package chapter13.video136;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Video136 {
    public static void bufferedOutputStreamExample(){
        try (FileInputStream fis = new FileInputStream("src\\chapter13\\video136\\demo.jpg");
             FileOutputStream fos = new FileOutputStream("src\\chapter13\\video136\\copy_demo.jpg");
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos);) {
                int b;
                while ((b = bis.read()) != -1) {
                bos.write(b);
                }

          }catch ( Exception e){
              System.out.println(e);
          }
    }

    public static void main(String[] args) {
        bufferedOutputStreamExample();
    }
}