package chapter12.lap10;

import java.util.List;

public class Lap10 {
    public static void main(String[] args) {
            InventoryItem<Integer>  t1 = new InventoryItem<>(123,"BIM BIM",12000);
            InventoryItem<String>  t2 = new InventoryItem<>("ID01","Pesi", 20000);
            InventoryUtils.printItemInfo(t1);
            InventoryUtils.printItemInfo(t2);
           List<InventoryItem<?>> list = List.of(t1,t2);
          double total = InventoryUtils.calculateTotalPrice(list);
        System.out.println("Total price: "+total);


    }
}
