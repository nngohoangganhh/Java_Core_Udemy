package chapter8.video78;

public class Bus extends Vehicle{
    public Bus (String brand){
        super(brand);
    }

    public void start(){
        System.out.println("Bus " +super.getBrand() +" is kick-starting...");
    }
}
