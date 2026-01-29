//package chapter13.video133;
//
//
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Arrays;
//import java.util.List;
//
//public class Video133 {
//    public static void readFile(){
//
//        try {
//            List<String> lines = null;
//            lines = Files.readAllLines(Paths.get("src\\chapter13\\video133\\input.txt"));
//              for (String line : lines) {
//            System.out.println(line);
//        }
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//
//    }
//
//    public static void writeFile(){
//
//        try {
//            List<String> lines = Arrays.asList("helo","lohe"
//            );
//
//        }
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//
//    public static void main(String[] args) {
//        readFile();
//    }
//}
