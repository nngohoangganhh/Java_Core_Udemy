package chapter2;

import java.util.Scanner;

public class Lap1Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tên:");
        String name = sc.nextLine();
        System.out.println("Nhập Tuổi:");
        int age = sc.nextInt();sc.nextLine();

        System.out.println(name + " có tuổi là "+ age);
    }
}
