package chapter12.lap10;

import java.util.List;

public class InventoryUtils {
    public static <T> void printItemInfo(InventoryItem<T> item){
        System.out.println("Id: " + item.getId(0) + " Name : "+ item.getName()+ " Price :"+ item.getPrice() );
    }
    public static <T> double calculateTotalPrice(List<InventoryItem<?>> items) {
        double total = 0;
        for (InventoryItem<?> item : items) {
            total+=  item.getPrice();
        }
        return total;
    }
}
