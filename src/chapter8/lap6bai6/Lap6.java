package chapter8.lap6bai6;

import chapter8.video82.Song;

public class Lap6 {
    public static void main(String[] args) {
        Engineer kysu1 = new Engineer("Hoàng Anh", 20, "IT ");
        Manager quanly1 = new Manager("Quang Tuyền", 23, 8);

        Person[] listPerson = {kysu1, quanly1};
        for (Person hihi : listPerson) { // upcasting
            hihi.introduce();
            hihi.work();
            if(hihi instanceof Trainable){
                Trainable t = (Trainable) hihi; //downcating
                t.attendTraining("Tiếng Hàn");
                t.feedback();
            }
        }
    }
}