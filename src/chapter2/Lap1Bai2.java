package chapter2;

import java.util.Scanner;

public class Lap1Bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào chiều dài:");
        int a = sc.nextInt();
        System.out.println("Nhập vào chiều rộng:");
        int b = sc.nextInt();
        int C = (a+ b )*2;
        int S = a *b ;
        System.out.println("Chu vi của hình chữ nhật: " + C);
        System.out.println("Diện tích của hình chữ nhật: "+ S);
        System.out.println(Math.min(a,b));
    }
}
