package chapter8.video80;

public class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(String name, String departments, double monthlySalary) {
        super(name, departments);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
   @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Type: Full Time");
    }
}
