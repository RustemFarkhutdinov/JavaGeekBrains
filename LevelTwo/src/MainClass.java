

public class MainClass {

    public static void main(String[] args) {

        RunningTack[] array = {
                new Dog("Tuzikc", 500, 5),
                new Cat("Tom", 200, 2),
                new Men("Kris", 100, 3)};

       JumpWall[] array2 = {
               new Obstacles(150),
               new Track(6546)
       };

        for (RunningTack a : array)  {
            for(JumpWall j : array2) {
                if(a.run(j.getLength()));
                else break;
            }
        }

    }
}
