package chapter11.video112;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Video112 {
    public static void hashSet(){
        System.out.println("run hashSet");
        HashSet<String> hoidanit = new HashSet<>();
        HashSet<Integer> numberHashset = new HashSet<>();
        numberHashset.add(10);
        numberHashset.add(4);
        numberHashset.add(20);
        numberHashset.add(3);
        hoidanit.add("anh");
        hoidanit.add("ngo");
        hoidanit.add("hoang");
        hoidanit.add("anh");
        ArrayList<String> hihi = new ArrayList<>();
        hihi.add("anh");
        hihi.add("ngo");
        hihi.add("hoang");
        hihi.add("anh");
        System.out.println(hoidanit);
        System.out.println("ARRAYLIST :"+hihi); // sắp xếp theo thứ tự được trùng nhau
        System.out.println(numberHashset);
    }
    public static void treeSet(){
       HashSet<Integer> numberHashset = new HashSet<>();

       TreeSet<Integer> numberTreeset = new TreeSet<>();
        numberHashset.add(10);
        numberHashset.add(4);
        numberHashset.add(20);
        numberHashset.add(3);
        numberHashset.add(20);

         numberTreeset.add(10);
         numberTreeset.add(4);
         numberTreeset.add(20);
         numberTreeset.add(3);
         numberTreeset.add(20);
        System.out.println(numberTreeset);// sắp sếp bé đến lơn khong trung nhau
        System.out.println(numberHashset);// sắp xếp không theo thứ tự không trùng nhau
        LinkedList<Integer> huha = new LinkedList<>();
         huha.add(10);
         huha.add(4);
         huha.add(20);
         huha.add(3);
         huha.add(20);
        System.out.println(huha);
    }

    public static void main(String[] args) {
    hashSet();
     treeSet();
    }
}
