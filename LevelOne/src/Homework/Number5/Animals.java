package Homework.Number5;
import java.util.Random;

public abstract class Animals {

    String name;
    int maxDistance;
    float maxJumpe;
    int maxSwim;

    final Random random = new Random();

    public Animals(String name, int maxDistance, float maxJumpe, int maxSwim) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJumpe = maxJumpe;
        this.maxSwim = maxSwim;
    }

    public Animals(String name, int maxDistance, float maxJumpe) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJumpe = maxJumpe;
    }

    protected void run(int needRun) {
       if (needRun < this.maxDistance) {
           System.out.println(name + " ran " + needRun + "m.");
       } else System.out.println(name + " couldn't run " + needRun + "m.");
    }

    protected void jumpe(float needJumpe) {
        if (needJumpe < this.maxJumpe) {
            System.out.println(name + " jumped over " +  needJumpe + "m.");
        } else System.out.println(name + " couldn't jump over " +  needJumpe + "m.");
    }

    protected void swim(int needSwim) {
        if (needSwim < this.maxSwim) {
            System.out.println(name + " swam by " + needSwim + "m." + "he could swim " + maxSwim  + "m");
        } else System.out.println(name + " couldn't swum " + needSwim + "m." + " Its limit " + maxSwim + "m");
    }

    public int getMaxSwim() {
        return maxSwim  = random.nextInt(5);
    }
//    public void setMaxSwim(int maxSwim){
//        this.maxSwim = maxSwim;
//    }
}
