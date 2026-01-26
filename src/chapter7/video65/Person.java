package chapter7.video65;

public class Person {
    String name;
    int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Person:" + this.name +" - "+ this.age);
    }

}
