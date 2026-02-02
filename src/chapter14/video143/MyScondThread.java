package chapter14.video143;

public class MyScondThread extends Thread{
    private String name;
    public MyScondThread(String name){
          this.name = name;
    }
    public void run (){
        System.out.println("run with scond thread");
        for (int i =0; i < 5 ; i++){
            try {
                System.out.println("name" +name + i);
                Thread.sleep(1500);
            }catch (InterruptedException e){
                  e.printStackTrace();
            }
        }
    }
}
