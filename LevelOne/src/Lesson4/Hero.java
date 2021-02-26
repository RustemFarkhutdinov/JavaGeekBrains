package Lesson4;

public class Hero {
    int health;
    int energy;
    double speed;
    String name;
    Weapon weapon = new Weapon(100, 250, 0.5f);

    class Weapon{
        int pAtk;
        int atkSpeed;
        float weight;

        Weapon( int _pAtk, int _atkSpeed, float _weight){
            int pAtk = _pAtk;
            int atkSpeed = _atkSpeed;
            float weight = _weight;
        }
    }

    void speak() {
        System.out.println(name + " go-go-go!!!");
    }

    void run() {
        System.out.println(name + "run with speed " + speed);
    }

    void jump() {
        System.out.println(name + "has jump " + speed*0.75 + "m");
    }
}

