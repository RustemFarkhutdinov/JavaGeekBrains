public interface JumpWall {

    String getName();
    int maxJumpe();
    int getLength();
    int getHeight();


    default boolean jump(int needJumpe) {
        if (needJumpe < maxJumpe()) {
            System.out.println(getName() + " jumped over " +  maxJumpe() + "m.");
            return true;
        } else System.out.println(getName() + " couldn't jump over " +  maxJumpe() + "m.");
        return false;
    }


}
