package chapter12.video123;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Video123 {

    public static <T> void printArr(List<T> Arr) {
        Arr.add((T) " HUHU ");
        for (T t : Arr) {
            System.out.print(t + " - ");
        }
    }
    public static  void printArrUnbounded(List<?> Arr) {
        for (Object o : Arr) {
            System.out.print(  o+ " - ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Video 121");

        String[] names = {"hoàng anh", " Ngô", " anh ngô"};
        ArrayList<String> hihi = new ArrayList<>(Arrays.asList(names));
        printArr(hihi);
        Integer[] scores = {7, 8, 9, 10};
       // printArr(scores);
        System.out.println("===============");
        printArrUnbounded(Arrays.asList(names));
    }
}