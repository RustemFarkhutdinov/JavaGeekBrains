package Lesson1;

public class Dog implements RunningTack, JumpWall {

    private final int maxDistance;
    private final String name;
    private final int maxJumpe;

    public Dog(String name, int maxDistance, int maxJumpe) {
        this.name = name;
        this.maxJumpe = maxJumpe;
        this.maxDistance = maxDistance;
    }

    @Override
    public int maxDistance() {
        return maxDistance;
    }

    @Override
    public int maxJumpe() {
        return maxJumpe;
    }

    @Override
    public int getLength() {
        return 0;
    }



    @Override
    public String getName() {
        return name;
    }

}
