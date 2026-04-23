package chapter5;

import java.util.Scanner;

public class Lap03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] name = new String[3];
        double[] score = new double[3];
        for (int i = 1 ; i < 4; i++){
            System.out.println("Nhập tên người thứ " + i + " của mảng : " );
            String aa = scanner.nextLine();
            name[i-1]= aa;
            System.out.println("Nhập điểm cho người thứ "+ i + " : ");
            double bb = scanner.nextDouble();scanner.nextLine();
            score[i-1] = bb;
        }
        System.out.println("--------------------------");
        System.out.println("Danh Sách tên các thành viên ");
        for (int i = 1; i <4; i++){
           System.out.println(name[i-1]);
           System.out.println(score[i-1]);
        }
        int diemTb=0, sum=0, diem =0;
        for (int i = 0; i < score.length;i++){
            sum+=score[i];
            diemTb= sum / (score.length);
            if ( 8 <= score[i]   ){
                System.out.println("điểm lớn hơn 8 là : " +score[i]);
            }
        }
        System.out.println("TỔNG ĐIỂM LÀ: "+ sum + " ĐIỂM TRUNG BÌNH " + diemTb);


    }
}
