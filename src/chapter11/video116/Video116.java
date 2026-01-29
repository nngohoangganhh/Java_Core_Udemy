package chapter11.video116;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Video116 {
    public static void Iterator(){
        ArrayList<String> languages= new ArrayList<>();
         languages.add("Java");
         languages.add("C#");
         languages.add("PHP");
         languages.add("C++");
         languages.add("JavaScript");
         Iterator<String> stringIterable = languages.iterator();
         while (stringIterable.hasNext()){
             String lang = stringIterable.next();
             if(lang.equals("C#")){
                 stringIterable.remove();
             }
         }
         for (String lang : languages){
             System.out.println(lang);
         }

    }
    public static void ListIteratorDemo(){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(12);
        nums.add(15);
        nums.add(29);
        nums.add(20);
        ListIterator<Integer> li = nums.listIterator();

        System.out.println("Duyệt xuôi:");
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("Duyệt ngược:");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        // Thêm phần tử 25 vào sau 20
        li = nums.listIterator();
        while (li.hasNext()) {
            if (li.next() == 20) {
                li.add(25); // Thêm sau 20
            }
        }

        System.out.println("Sau khi thêm 25: " + nums);

    }


    public static void main(String[] args) {
        //Iterator();
         ListIteratorDemo();
    }
}
