package Lesson4;

import java.util.Random;

public class Lesson4 {

    public static Random random = new Random();

    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.energy = 1;
        hero1.health = 10;
        hero1.speed = 102;
        hero1.name = "Mario";


        System.out.println(hero1.name);

        int X = random.nextInt();
        int Y = (int) (Math.random()*3);

        if (2147483647 > X && X > -2147483648){
            System.out.println("/// "+ X);
            System.out.println(Y);
        } else  System.out.println("!!!!!xyina");


   //


        hero1.speak();
        hero1.run();
        hero1.jump();

        System.out.println(hero1.weapon.atkSpeed);
    }
}
