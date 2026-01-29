package chapter11.video111;

import java.util.ArrayList;

public class Video111 {
    public static void main(String[] args) {
        System.out.println("Video111");
        ArrayList<Student> students = new ArrayList<>();
        Student st1 = new Student("anh", 19);
        Student st2 = new Student("hoang", 20);
        Student st3 = new Student("ngo", 21);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        for ( Student hihi: students){
            System.out.println("name:"+ hihi.getName()+" age:"+hihi.getAge());
        }
         Student st4 = new Student("ngo hiih", 21);
        students.add(1,st4);
        System.out.println("-------------");
          for ( Student hihi: students){
            System.out.println("name:"+ hihi.getName()+" age:"+hihi.getAge());
        }
        System.out.println("-----------");
          students.remove(3);
            for ( Student hihi: students){
            System.out.println("name:"+ hihi.getName()+" age:"+hihi.getAge());
        }




    }
}
