package chapter13.video131;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Video131 {
 public static void fileReaderExample(){

    try (FileReader file = new FileReader("src\\chapter13\\video131\\input.txt")){
       int c;
       while ((c = file.read( )) != -1) { // Đọc từng ký tự, trả về int
        System.out.print((char) c); // Ép int về char để hiển thị
 }

    } catch (Exception e) {
        System.out.println(e);
    }
 }

 public static void FileWriter(){

     try(FileWriter fw = new FileWriter("src\\chapter13\\video131\\output.txt")) {
        fw.write("tesst");
        fw.write("hihii");
     } catch (IOException e) {
         System.out.println(e);
     }
 }
 public static void printWriterExample(){
    try (PrintWriter pw = new PrintWriter("src\\chapter13\\video131\\print.txt")) {
                 pw.println("Hello, PrintWriter!");
            pw.printf("Number: %d, String: %s\n", 10, "Java");
    }catch (Exception e){
        System.out.println(e);
    }

 }

    public static void main(String[] args) {
        System.out.println("Video 131");
        fileReaderExample();
        FileWriter();
        printWriterExample();
    }
}
