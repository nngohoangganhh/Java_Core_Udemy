package chapter8.lap6bai6;

public class Engineer extends Person implements Trainable {
    private String specialty;
    public Engineer(String name, int age, String specialty) {
        super(name, age);
        this.specialty =  specialty;
    }
    @Override
    public void attendTraining(String topic) {
        System.out.println("Engineer: "+ super.getName() + " is attending tranning on "+  topic);
    }
    @Override
    public void feedback() {
        Trainable.super.feedback();
    }

    @Override
    void work() {
        System.out.println("Engineer: " + super.getName() +" is working "+ this.specialty +" project" );
    }
}
