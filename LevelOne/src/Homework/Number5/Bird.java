package Homework.Number5;

public class Bird extends Animals{

    public Bird(String name, int maxDistance, float maxJumpe) {

        super(name, maxDistance, maxJumpe);
    }

    @Override
    protected void swim(int needSwim) {
        System.out.println(name + " does not float");
    }

}
