package chapter7.video66;

public class Vehicle {
    private String brand;
    private String year;

    public Vehicle(String brand, String year) {
        this.brand = brand;
        this.year = year;
        System.out.println("run from vehicle");
   }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void printInfo(){
        System.out.println("Vehicle :"+this.brand+ " ; "+ this.year);


    }
}
