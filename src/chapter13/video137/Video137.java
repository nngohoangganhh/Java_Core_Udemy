package chapter13.video137;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Video137 {
    public static void read(){
        try {
            String filePath = "src\\chapter13\\video137\\input.txt";
            byte[ ] data = Files.readAllBytes(Paths.get(filePath));
            System.out.println("Đã đọc file: " + filePath);
            System.out.println("Kích thước file: " + data.length + " bytes");
            System.out.println("Giá trị byte đầu tiên: " + data[0]);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void write() {
       try {
            String filePath = "src\\chapter13\\video137\\output.txt";
            byte[ ] data = {10, 20, 30, 40, 50}; // mảng byte mẫu
            Files.write(Paths.get(filePath), data);
            System.out.println("Đã ghi file: " + filePath);
        }catch (Exception e){
           System.out.println(e);
        }
    }
    public static void main(String[] args) {
        System.out.println("Video137");
          read();
          write();
    }
}
