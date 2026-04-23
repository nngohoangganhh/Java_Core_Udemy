package chapter4;

public class Video30 {
    public static void main(String[] args) {
            int day = 3;
            switch (day){
                case 1:
                    System.out.println("thứ 2");
                    break;
                case 2:
                    System.out.println("thứ 3");
                    break;
                default:
                    System.out.println("Another day");
            }
            String result = switch (day){
                case 1-> " thứ 2";
                case  2 -> "thứ 3";
                default -> "Another day";
            };
        System.out.println(result);

    }
}
