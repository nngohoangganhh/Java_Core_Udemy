package chapter9.video91;

public class Video91 {
    public static void main(String[] args) {
        System.out.println("VIDEO 91");
        Person hihi = new Person("Hoàng Anh", 23);
      //  Person.userID myData = hihi.new userID("0122222"," Thái Nguyên");
        Person.userID myData = new Person.userID("01234564","Hà Nội");
        System.out.println("check name:" +hihi.getName());
        System.out.println("check cccd:"+myData.getCccd());
       // myData.printInfo();
    }
}
