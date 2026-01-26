package chapter7.video68;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name , int id, double salary) {
        this.name= name;
        this.salary =salary;
        this.id =id;
    }

    double caculateSalary(){
        return this.salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
