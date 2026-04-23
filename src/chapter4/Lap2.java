package chapter4;

import java.util.Scanner;

public class Lap2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int score =0;
        int count = 0, sum =0;
        do {
            System.out.println("nhập điểm từ bàn phím: ");
            score= sc.nextInt();
            if(score ==-1){
                continue;
            }
            if(score < 0 || score > 10 ){
                System.out.println(" không hợp lệ hãy nhập lại: ");
                continue;
            }
            count++;
            sum=score+sum;
        }while (score !=-1);
        System.out.println("kết thúc    " );
        System.out.println(" sum = " + sum  + " count = " + count );

        System.out.println("-----MENU-----");
        System.out.println("1.TÍNH ĐIỂM TRUNG BÌNH");
        System.out.println("2.PHÂN LOẠI HỌC LỰC ");
        System.out.println("3.THOÁT CHƯƠNG TRÌNH");
        System.out.println("-----------------");
        int choice = sc.nextInt();

          float diemTB = sum / count;
        switch (choice){
            case 1:
                System.out.println("Bạn đã lựa chọn tính năng 1.");
                System.out.println("----------------------------");
                  // printf
                System.out.printf("điểm trung bình là = %.2f",diemTB);
                break;
            case 2:
                System.out.println("Bạn đã lựa chọn tính năng 2.");
                System.out.println("-----------------------------");
                   if (  diemTB >= 9 && diemTB  <= 10){
                       System.out.println(" Xuất sắc");
                   } else if (diemTB >= 8 && diemTB<=  9) {
                       System.out.println(" Giỏi  ");
                   } else if (diemTB >= 6.5 && diemTB <= 8) {
                       System.out.println(" Khá");
                   } else if (diemTB >= 5 && diemTB <= 6.5) {
                       System.out.println(" Trung Bình ");
                   } else if (diemTB>= 0 && diemTB< 5) {
                       System.out.println(" Yếu ");
                   }else {

                       System.out.println("Không hợp lệ ");
                   }
                   break;
            case 3:
                System.out.println("Bạn chọn tính năng 3");
                break;
        }
      sc.close();
    }
}
