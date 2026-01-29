package chapter12.video122;

public class Video122 {
    public static void main(String[] args) {
        System.out.println("Video122");
        MyTransaction<Integer, Integer,String> t1 = new MyTransaction<>(1,10000,"Thành Công");
         MyTransaction<String, Double,TransactionStatus> t2 = new MyTransaction<>("ID02",20.555,
              TransactionStatus.PENDING);
        System.out.println(t1);
        System.out.println(t2);
    }
}
