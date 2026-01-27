package chapter8.video80;

public class Video80 {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Hoàng Anh", "IT",  100000);
        Employee emp2 = new PartTimeEmployee(" Ngô Hoàng Anh "," TÀI CHÍNH", 7, 20000);
        Employee[] list = {emp1, emp2};
        for ( Employee em : list ){
            em.printInfo();
            System.out.println("Salary :" + em.calculateSalary());
        }
    }
}
