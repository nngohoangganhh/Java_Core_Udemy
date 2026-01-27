package chapter8.video78;

public class Video78 {
    public static void main(String[] args) {
        System.out.println("video 78");
        Car myCar = new Car("Toyota");
        Bus myBus = new Bus("Vin");
        Motorbike myMotor = new Motorbike("HONDA");

        Vehicle[] phuongtien = new Vehicle[3];
        phuongtien[0]= myCar;
        phuongtien[1]= myBus;
        phuongtien[2]= myMotor;
//        Vehicle[] phuongtien = { myCar, myBus, myMotor};
        for (Vehicle hihi : phuongtien){
            hihi.start();
        }

    }
}
