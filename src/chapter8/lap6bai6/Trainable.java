package chapter8.lap6bai6;

public interface Trainable {
    void attendTraining (String topic) ;// public abstract

    default void feedback(){
        System.out.println("Thanks for the training session");
        System.out.println("                                 ");
    }
}
