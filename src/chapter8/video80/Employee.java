package chapter8.video80;

public abstract class Employee {
    private String name;
    private String departments;

    public Employee(String name, String departments) {
        this.name = name;
        this.departments= departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }


    public  abstract double calculateSalary();

    public void printInfo(){
        System.out.println("Tên là: "+ this.name);
        System.out.println("Phòng ban là: "+ this.departments);
    }


}
