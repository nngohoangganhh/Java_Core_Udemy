package chapter3;

import java.util.Scanner;// giỏi

public class Video29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào điểm:");
        float score = sc.nextInt();sc.nextLine();
        if (score >= 9 && score  <= 10){
            System.out.println(" Xuất sắc");
        } else if (score >= 8 && score<=  9) {
            System.out.println(" Giỏi  ");
        } else if (score >= 6.5 && score <= 8) {
            System.out.println(" Khá");
        } else if (score >= 5 && score <= 6.5) {
            System.out.println(" Trung Bình ");
        } else if (score>= 0 && score< 5) {
            System.out.println(" Yếu ");
        }else {
            System.out.println("Không hợp lệ ");
        }
        sc.close();

    }
}
