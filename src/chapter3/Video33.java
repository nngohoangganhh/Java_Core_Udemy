package chapter3;

import java.util.Scanner;

public class Video33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int sum = 0;
        for( int i =1 ; i <= 100; i++  ){
            sum = sum +i;
        }
//        System.out.println(" sum ="+sum);
//        int j = 2;
//        while (j <= 20 ){
//            if(j % 2== 0){
//                System.out.println(" Đây là số chẵn :"+ j);
//            }
//            j++;
//        }

        String password = " hoang anh";
        String input = "";
        do {
            System.out.println("Nhập vào mật khẩu: ");
             input = sc.nextLine();
        }while (password.equals(input));
        System.out.println("đã nhập đúng");
       sc.close();
    }
}
