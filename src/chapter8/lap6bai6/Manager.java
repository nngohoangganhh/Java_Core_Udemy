package chapter8.lap6bai6;

public class Manager extends Person implements Trainable{
    private int teamSize;

    public Manager(String name, int age, int teamSize) {
        super(name, age);
        this.teamSize = teamSize;
    }
    @Override
    public void feedback() {
        Trainable.super.feedback();
    }
    @Override
    void work() {
        System.out.println("Manager" + super.getName() + " is managing a team of " + this.teamSize );
    }
    @Override
    public void attendTraining(String topic) {
        System.out.println("Manager" + super.getName() + " is attending management training on "+topic);
    }

}
