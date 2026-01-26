package chapter7.video68;

public class Manager extends Employee{
    private String departments;

    public Manager(String name, int id, double salary, String departments) {
        super(name, id, salary);
        this.departments = departments;
    }
    @Override
    double caculateSalary(){
        double curruntSalary = super.caculateSalary();
        return curruntSalary * 1.1;
    }
    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }


}
