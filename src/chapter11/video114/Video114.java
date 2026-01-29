package chapter11.video114;

import java.util.HashSet;

public class Video114 {
    public static void main(String[] args) {
        System.out.println("Video 114");
        Product p1 = new Product(1,"Laptop",1500.0);
        Product p2 = new Product(2, "Mouse", 20.0);
        Product p3 = new Product(3, "Keyboard", 45);
        Product p4 = new Product(1, "Laptop Pro", 2000);
        Product p5 = new Product(1, "Laptop", 1500);
        HashSet<Product> products = new HashSet<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
       // products.remove(p3);

        for (Product huhi : products){
            System.out.println(huhi);
        }


    }

}
