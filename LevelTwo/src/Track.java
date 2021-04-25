public class Track implements JumpWall {

    private final int length;

    public Track(int length) {
        this.length = length;
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
        return length;
    }

    @Override
    public int getHeight() {
        return 0;
    }

}
