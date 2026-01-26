package chapter7.video66;

public class Car extends Vehicle{
   private String type;
   public Car(String type,String brand, String  year ){
       super(brand,year);
       this.type =type;
       System.out.println("Run constructor from car");
   }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

     public void printInfo(){
       super.printInfo();
        System.out.println("Car :"+this.type);
    }

}
