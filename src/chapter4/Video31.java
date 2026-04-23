package chapter4;

import java.util.Scanner;

public class Video31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số từ 1 đến 7 :");
        int day = sc.nextInt();sc.nextLine();
        switch (day){
                case 1:
                System.out.println(" thứ 2");
                break;
                case 2:
                System.out.println(" thứ 3");
                break;
                case 3:
                System.out.println(" thứ 4");
                break;
                 case 4:
                System.out.println(" thứ 5");
                break;
                 case 5:
                System.out.println(" thứ 6");
                break;
                 case 6:
                System.out.println(" thứ 7");
                break;
                 case 7:
                System.out.println(" CHỦ NHẬT");
                break;
            default:
                System.out.println("không hợp lệ");
                break;

        }
        sc.close();
    }
}
