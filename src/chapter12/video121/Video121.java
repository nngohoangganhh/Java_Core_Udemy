package chapter12.video121;

public class Video121 {

     public static <T> void printArr(T[] Arr){
       for (T t : Arr){
           System.out.print(t + " - ");
       }
    }
    public static void main(String[] args) {
        System.out.println("Video 121");
        IventoryItem<Integer> it1 = new IventoryItem<>(1, "tủ lạnh");
        System.out.println(" item 1 ="+it1);
        IventoryItem<String> it2 = new IventoryItem<>("SKU122", "tủ lạnh");
        System.out.println(" item 2 = " + it2);
        String[] names = {"hoàng anh", " Ngô", " anh ngô"};
        printArr(names);
        Integer[] scores = {7,8,9,10};
        printArr(scores);
    }
}
