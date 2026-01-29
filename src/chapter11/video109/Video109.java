package chapter11.video109;

import java.util.ArrayList;

public class Video109 {
    public static void main(String[] args) {
        System.out.println("Video 109");
        ArrayList<String> hoidanit =  new ArrayList<>();
        hoidanit.add("Hà Nội ");
        hoidanit.add("hcm");
        hoidanit.add("da nẵng");

        for (String city : hoidanit){
            System.out.println(city );
        }


        ArrayList<Integer> test = new ArrayList<>();
        test.add(0);
        test.add(9);
        for (int city : test){
            System.out.println(city);
        }
    }
}
