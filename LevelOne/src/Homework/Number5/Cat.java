package Homework.Number5;

public class Cat extends Animals{

    int restrictionRun = 200;

    public Cat(String name, int maxDistance, float maxJumpe) {
        super(name, maxDistance, maxJumpe);
    }

    @Override
    protected void swim(int needSwim) {
        System.out.println(name + " does not float");
    }

}
