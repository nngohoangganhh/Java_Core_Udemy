package chapter4;

public class Video35 {
    public static void main(String[] args) {
        for (int i =1 ; i <= 100; i++){
            if(i %7==0) {
                System.out.println("i=" + i);
                break;
            }
        }
        int count = 0;
        for (int i = 1; i <= 100; i++){
            if(i % 7 == 0) {
              count = count+1;
                if (count ==3 ){
                    System.out.println(" i thứ 3 = "+ i);
                    break;
                }
            }
        }
        for (int j = 1; j <= 10; j++){
            if(j % 2==1 )  continue;
            System.out.println("j= "+ j);
        }


    }
}
