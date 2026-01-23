package chapter6.video55;

public class Video55 {
    public static void main(String[] args) {
        System.out.println("Video 55");
        Student st = new Student("Hoang Anh",20);
        Student st2 = new Student("Hoang Anh Ngo", 26);
        System.out.println("check name st1 :"+ st.name);
        System.out.println(st2.name);
        Student st3 = new Student();
        st3.name= " ahihi";

    }
}
