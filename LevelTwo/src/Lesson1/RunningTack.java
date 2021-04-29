package Lesson1;

public interface RunningTack {

   String getName();
   int maxDistance();


    default boolean run(int length) {
        if (length <= maxDistance()) {
            System.out.println(getName() + " ran " + length + "m.");
            return true;
        } else System.out.println(getName() + " couldn't run " + length + "m.");
        return false;
    }



}
