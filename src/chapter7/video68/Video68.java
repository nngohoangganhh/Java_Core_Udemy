package chapter7.video68;



public class Video68 {
    public static void main(String[] args) {
    Manager boss = new Manager("hoàng Anh", 123, 1000, "IT");
    Programer pro = new Programer("Hoàng Anh Ngô ", 345, 1000);

        System.out.println("boss salary :"+ boss.caculateSalary());
        System.out.println("dev salary :"+ pro.caculateSalary());
    }
}
