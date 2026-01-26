package chapter7.video65;

public class Student extends Person{
  String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void printInfo(){
        System.out.println("Student" + this.school);
    }

     public void test(){
        this.printInfo();
        super.printInfo();
    }
}
