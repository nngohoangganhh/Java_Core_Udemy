package chapter7.lap5;

public class Lap5Bai5 {
    public static void main(String[] args) {
        Manager m1 = new Manager("Hoàng Anh", 20, "EM01", 100000,"IT");
        m1.introduce();
        System.out.println("----------------------------");
        System.out.println("Lương cơ bản : " + m1.calaculateSalary());
        System.out.println("Lương sau thưởng : "+ m1.calaculateSalary(500));

    }

}
