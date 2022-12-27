package oop;

// 인터페이스 생성
interface Predator1 {
    // 인터페이스의 메서드(내용은 implements한 클래스들이 구현)
    String getFood();

    // 디폴트 메서드
    default void printFood() {
        System.out.printf("my food in %s\n", getFood());
    }

    // 스태틱 메서드
    int LEG_COUNT = 4; // 인터페이스 상수
    static int spped() {
        return LEG_COUNT * 30;
    }
}

class Animal4 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger1 extends Animal4 implements Predator1 { // 인터페이스 구현
    public  String getFood() {
        return "apple";
    }
}

class Lion1 extends Animal4 implements Predator1 {
    public  String getFood() {
        return "banana";
    }
}

class ZooKeeper1 {

    void feed(Predator1 predator1) {
        System.out.println("feed "+predator1.getFood());

//        System.out.println("feed apple"); // 무조건 apple만 출력됨

        // 메서드 오버로딩
//    void feed (Tiger tiger) {
//        System.out.println("feed apple");
//    }
        // 메서드 오버로딩
//    void feed(Lion lion) {
//        System.out.println("feed banana");
//    }
    }
}

public class Interface {
    public static void main(String[] args) {
        ZooKeeper1 zooKeeper1 = new ZooKeeper1();
        Tiger1 tiger1 = new Tiger1();
        Lion1 lion1 = new Lion1();
        zooKeeper1.feed(tiger1);
        zooKeeper1.feed(lion1);
    }
}
