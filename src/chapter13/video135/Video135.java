package chapter13.video135;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Video135 {

    public static void fileInputStreamExample(){
        try( FileInputStream fis = new FileInputStream("src\\chapter13\\video135\\demo.jpg");) {

           int sizeInBytes = fis.available(); // available trả về số byte có thể đọc
           double sizeInMB = (double) sizeInBytes / (1024 * 1024);
           System.out.printf("Kích thước file: %.2f MB\n", sizeInMB);


        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void fileOutputStreamExample(){
          try (   FileInputStream fis = new FileInputStream("src\\chapter13\\video135\\demo.jpg");
              FileOutputStream fos = new FileOutputStream("src\\chapter13\\video135\\copy_demo.jpg")) {
                int b;
                while ((b = fis.read()) != -1) {
                fos.write(b);
                }

          }catch ( Exception e){
              System.out.println(e);
          }
    }

    public static void main(String[] args) {
        System.out.println("video 135" );
       // fileInputStreamExample();
        fileOutputStreamExample();

    }
}
