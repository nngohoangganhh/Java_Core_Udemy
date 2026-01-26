package chapter6.lap4Bai4.model;

public class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;
    private String company;

    public Employee(String name1, int age, String department, double salary ) {
        this.name= name1;
        this .age = age;
        this.salary=salary;
        this.department =   department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void showInfo(){

        System.out.println("Nhân viên có tên :"+name);
        System.out.println("Tuổi : "+ this.age);
        System.out.println("làm việc ở :"+this.department);
        System.out.println("lương ban đầu : "+this.salary);
        System.out.println("công ty là : " + this.company);
    }

     public void raiseSalary( double amount ){
        if (amount > 0){
            double CurruntSalary = this.getSalary();
            double AfterSalary = CurruntSalary * 1.15;
            this.setSalary(AfterSalary);
        }
    }


}
