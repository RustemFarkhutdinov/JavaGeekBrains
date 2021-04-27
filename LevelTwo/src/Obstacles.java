public class Obstacles implements JumpWall{

    private final int height;

    public Obstacles(int height) {
        this.height = height;
    }

    @Override
    public String getName() {
        return null;
    }
    @Override
    public int maxJumpe() {
        return 0;
    }


    public int getLength() {
        return height;
    }

}
