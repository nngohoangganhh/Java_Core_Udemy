package chapter6.lap4Bai4.video60;

import chapter6.lap4Bai4.model.Employee;

public class Video60 {
    public static void main(String[] args) {
      Employee nv1 = new Employee("HOÀNG ANH",20,"Marketing", 100000);
      nv1.setCompany("Evotek");
      nv1.showInfo();
      System.out.println("--------------------");
      nv1.raiseSalary(6);
      nv1.showInfo();
    }
}
