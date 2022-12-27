package oop;

// interface Predator 를 추상 클래스로 변경
abstract class Predator extends Animal { // abstract class로 변경
    abstract String getFood(); // abstract class로 변경

    void printFood() { // default 삭제
        System.out.printf("my food in %s\n", getFood());
    }

    static int LEG_COUNT = 4; // static 추가

    static int spped() { // static 추가
        return LEG_COUNT * 30;
    }
}

interface Barkable {
    void bark();
}

// 하나의 객체가 여러개의 자료형 가질 수 있는 것이 다형성
//interface BarkablePredator extends Predator, Barkable { } // 추상클래스로 변경하여 사용이 불가능 하므로 삭제

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Predator implements Barkable { // Animal대신 Preadtor extends, Barkable implements
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Predator implements Barkable { // Animal대신 Preadtor extends, Barkable implements
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁렁");
    }
}

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Barkable animal) {
        animal.bark();
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
        System.out.println("---------------");
        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }
}
