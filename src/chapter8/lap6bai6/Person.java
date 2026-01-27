package chapter8.lap6bai6;

public abstract class Person {
   private String name;
   private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    abstract void work();

    public void introduce(){
        System.out.println("My name is "+ this.name + " I am "+this.age + " year old");
    }
}
