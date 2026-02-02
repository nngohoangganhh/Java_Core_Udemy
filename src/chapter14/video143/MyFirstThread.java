package chapter14.video143;

public class MyFirstThread extends Thread{
   private String name;

   public MyFirstThread (String name){
       this.name = name;
   }
   public void run (){
        System.out.println("run with firts thread");
        for (int i =0; i < 5 ; i++){
            try {
                System.out.println("name" +name + i);
                Thread.sleep(500);
            }catch (InterruptedException e){
                  e.printStackTrace();
            }
        }
    }
}
