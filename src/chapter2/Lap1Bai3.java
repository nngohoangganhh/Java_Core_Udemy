package chapter2;

import java.util.Scanner;

public class Lap1Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạch của hình lập phương:");
        int a = sc.nextInt();
        double S = Math.pow(a,3);
        double V= a * a * a;
        System.out.println("Thể tích của hình lập phương là:"+V);
    }
}
