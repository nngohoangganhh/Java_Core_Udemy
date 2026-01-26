package chapter7.lap5;

public class Employee extends Person{
        private String employyeeId;
        private static double salary;

    public Employee(String name, int age, String employyeeId, double salary) {
        super(name, age);
        this.employyeeId = employyeeId;
        this.salary=  salary;
    }

    public String getEmployyeeId() {
        return employyeeId;
    }

    public void setEmployyeeId(String employyeeId) {
        this.employyeeId = employyeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("Mã Nhân Viên : " + this.employyeeId);
        System.out.println("Lương :" + this.salary);
    }
    public double calaculateSalary(){
        return this.salary;
    }
    public double calaculateSalary(double bonus){
        return this.salary + bonus;

    }


}
