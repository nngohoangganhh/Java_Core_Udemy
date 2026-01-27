package chapter8.video76;

public class Video76 {
    public static void main(String[] args) {
      Animals ani = new Animals();

      Animals test = new Dog();// upcating
      Dog D = (Dog) test;// downcating
        test.makeSound();
        D.wagTail();

    }
}
