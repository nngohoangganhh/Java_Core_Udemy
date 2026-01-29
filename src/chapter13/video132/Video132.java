package chapter13.video132;


import java.io.*;

public class Video132 {
 public static void bufferedReaderExample() {
     try (FileWriter fr = new FileWriter("src\\chapter13\\video132\\input.txt");
     BufferedReader br = new BufferedReader(null)) {
     }catch (Exception e){
         System.out.println(e);
     }
 }
 public static void bufferWriterExample() {
   try (FileWriter fw = new FileWriter("src\\chapter13\\video132\\output.txt");
     BufferedWriter br = new BufferedWriter (fw)){
   }catch (Exception e){
       System.out.println(e );
   }
 }
    public static void main(String[] args) {
        System.out.println("Video 132");
        bufferedReaderExample();
        bufferWriterExample();


    }
}
