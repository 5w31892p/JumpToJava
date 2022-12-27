package oop;

interface Predator2 {
    String getFood();

    default void printFood() {
        System.out.printf("my food in %s\n", getFood());
    }

    int LEG_COUNT = 4; // 인터페이스 상수

    static int spped() {
        return LEG_COUNT * 30;
    }
}
interface Barkable1 {
    void bark();
}

// 하나의 객체가 여러개의 자료형 가질 수 있는 것이 다형성
interface BarkablePredator1 extends Predator2, Barkable1 {

}

class Animal5 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger2 extends Animal5 implements BarkablePredator1 { // implements Predator2, Barkable1 를 BarkablePredator로 변경
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion2 extends Animal5 implements BarkablePredator1 {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁렁");
   }
}

class ZooKeeper2 {
    void feed(Predator1 predator1) {
        System.out.println("feed " + predator1.getFood());
    }
}

class Bouncer1 {
    void barkAnimal (Barkable1 animal) {
        animal.bark();
    }
//    void barkAnimal(Animal5 animal5) {
//        if (animal5 instanceof Tiger2) {
//            System.out.println("어흥");
//        } else if (animal5 instanceof Lion2) {
//            System.out.println("으르렁");
//        }
//    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Tiger2 tiger2 = new Tiger2();
        Lion2 lion2 = new Lion2();

        Bouncer1 bouncer1 = new Bouncer1();
        bouncer1.barkAnimal(tiger2);
        bouncer1.barkAnimal(lion2);
    }
}
