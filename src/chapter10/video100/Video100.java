package chapter10.video100;

import java.util.Scanner;

public class Video100 {

    public static void checkScore(int score){
        if ( score < 0 || score > 10 ){
            throw  new IllegalArgumentException(" không lợp le");
        }
        System.out.println(" điểm là :"+ score);
    }
    public static void main(String[] args) {
        System.out.println("video 100");
       // Scanner scanner = new Scanner(System.in);
//        // cách 1
//        System.out.println("Nhập điểm số: ");
//        int input = scanner.nextInt();
//        try {
//            checkScore(input);
//        }catch (IllegalArgumentException e){
//            System.out.println("Lỗi"+e.getMessage());
//        }finally {
//            System.out.println("Kết thúc chương trình");
//        }
       // scanner.close();
        // cách 2 try with resources
        System.out.println("Nhập điểm: ");
        try (Scanner scanner = new Scanner(System.in)){
            int input = scanner.nextInt();
            checkScore(input);
        }catch (IllegalArgumentException e){
               System.out.println("Lỗi"+e.getMessage());
        }finally {
            System.out.println("kết thúc ");
        }



    }
}
