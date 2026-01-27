package chapter9.video88;

public class Video88 {
    public static void main(String[] args) {
        System.out.println("my role :" + Role.ADMIN);
        System.out.println("my role with enum"+MyRole.ADMIN);
        System.out.println(Role.GUEST);
        MyRole test = MyRole.ADMIN;
        System.out.println(Role.USER);

    }
}
