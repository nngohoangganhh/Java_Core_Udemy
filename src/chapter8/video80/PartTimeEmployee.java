package chapter8.video80;

public class PartTimeEmployee  extends Employee{
    private int  hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, String departments, int hoursWorked,double hourlyRate) {
        super(name, departments);
        this.hoursWorked = hoursWorked;
        this.hourlyRate =hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return this.hourlyRate * this.hoursWorked;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type : Part-time");
    }
}
