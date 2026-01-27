package chapter9.video90;

import java.util.Scanner;

public class Video90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập trạng thái của đơn hàng : ");
        String status = scanner.nextLine().toUpperCase();

        try {
         //Data type // input là các Trạng Thái trong enum
         OrderStatus input = OrderStatus.valueOf(status);
            System.out.println("Trạng Thái: " + input.getDescription() );
            System.out.println("Trạng thái cuối cùng: "+input.hasFinal());
        }catch ( Exception e ){
            System.out.println("Trạng thái không hợp lệ");
        }
       // System.out.println("Test = "+ status);
      scanner.close();
    }
}
