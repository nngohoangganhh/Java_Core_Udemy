package chapter7.video70;

public class CustomerPrinter {
    public void print(String name){
        System.out.println("name: "+  name);
    }
    public void print(String name, int age){
        System.out.println("name: "+ name +"age:"+age);
    }
    public void print(String name, int age, String city){
        System.out.println("name: "+ name +" age: "+age + " city: " +city);
    }
}
