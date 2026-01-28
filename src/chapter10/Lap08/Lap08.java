package chapter10.Lap08;

import java.util.Scanner;

public class Lap08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập username: ");
        String name = scanner.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String pass = scanner.nextLine();
        System.out.println("Nhập số dư : ");
        double blance = scanner.nextDouble();scanner.nextLine();
        System.out.println("Nhập số tiền cần rút: ");
        double amount = scanner.nextDouble(); scanner.nextLine();
        try {
            BankAccount bankAccount = new BankAccount(name, pass, blance);
            bankAccount.withdraw(amount);
        }catch ( Exception e){
            System.out.println(e.getClass().getName() +  " : "+ e.getMessage());
        } finally {
            System.out.println("KẾT THÚC GIAO DỊCH");
        }

    }
}
