package chapter13.video133;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Video133 {

    public static void readFile(){
      try {
          List<String> lines = Files.readAllLines(Paths.get("src\\chapter13\\video133\\input.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
      } catch (Exception e){
          System.out.println(e);
      }
    }
    public static void writeFile(){
      try {
           List<String> lines = Arrays.asList(
                "Hello, java.nio.file.Files!",
                "This is write() example."
            );
            Files.write(Paths.get("src\\chapter13\\video133\\output.txt"), lines);

      }catch (Exception e) {
          System.out.println(e);
      }
    }

    public static void main(String[] args) {
      //   readFile();
        writeFile();
    }
}
