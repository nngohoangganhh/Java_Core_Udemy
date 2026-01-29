package chapter12.video124;

import java.util.Arrays;
import java.util.List;

public class Video124 {

public static void printNumbers(List<? extends Number> list) {
    for (Number n : list) {
        System.out.println(n);
    }
}

    public static void main(String[] args) {
        System.out.println("Video 124");
        printNumbers(Arrays.asList(1,2,34,5));
        printNumbers(Arrays.asList(2.4,3.5,6.9));


    }
}
