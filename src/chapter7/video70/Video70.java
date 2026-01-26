package chapter7.video70;

public class Video70 {
    public static void main(String[] args) {
        CustomerPrinter cp = new CustomerPrinter();
        cp.print("Hoàng Anh");
        cp.print("Hoàng Anh Ngô",21);
        cp.print(" Ngô Hoàng Anh", 21, " HÀ Nội");
    }
}
