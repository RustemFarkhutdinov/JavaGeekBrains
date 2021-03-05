package Homework.Number5;


import java.util.Random;

public class MainAnimals {
    public static void main(String[] args) {
        Horse horse1 = new Horse("Mustang", 1500, 3, 100 ); // 3. ограничения животного
        Dog dog1 = new Dog("Tuzikc", 500, 0.5f, 10 );
        Cat cat1 = new Cat("Tom", 200, 2);
        Bird bird1 = new Bird("Vorobei", 5, 0.2f);

        Horse horse2 = new Horse("Буцефал", 1500, 3, 100 );


        int needRun= 150;
        float needJump= 1.5f;
        int needSwim = 50;

       Animals[] array = {cat1, dog1, bird1, horse1, horse2};
        for(int i = 0; i<array.length; i++){

            array[i].getMaxSwim(); // 5.* переопределяет разброс ограничения

            array[i].run((needRun)); // 4. выполнение действия
            array[i].jumpe((needJump));
            array[i].swim((needSwim));
      }
    }

}
