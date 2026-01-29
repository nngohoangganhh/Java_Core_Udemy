package chapter11.video115;

import java.util.HashMap;
import java.util.TreeMap;

public class Video115 {
    public static void hashMap(){
        System.out.println("hashMap");
        // sắp xếp lộn xộn
        HashMap<Integer,String> hoangAnh = new HashMap<>();
        hoangAnh.put(1,"Hoàng Anh");
        hoangAnh.put(2,"Hoàng Anh Ngô");
        hoangAnh.put(3,"Ngô Hoàng Anh");
        hoangAnh.put(4,"anh ngô ");
        System.out.println(hoangAnh);
    }
    // sắp theo thứ tự tăng dần
    public static void treeMap(){
        System.out.println("Tree Map");
        TreeMap<Integer,String> hoanganh = new TreeMap<>();
        hoanganh.put(1,"Hoàng Anh uuuu");
        hoanganh.put(8,"Hoàng Anh Ngô hhh");
        hoanganh.put(9,"Ngô Hoàng Anh hhh");
        hoanganh.put(4,"anh ngô jjj");
        System.out.println(hoanganh);
    }

    public static void main(String[] args) {
          treeMap();
          hashMap();
    }
}
