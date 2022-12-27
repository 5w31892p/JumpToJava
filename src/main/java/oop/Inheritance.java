package oop;

class Animal2 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog1 extends Animal2 {
    // 부모 클래스 기능 확장
    void sleep() {
        System.out.println(this.name + " zzZ");
    }
}

class HouseDog1 extends Dog1 {
    // 메서드 오버라이딩 (내용만 조금 변경 후 재구현)
    void sleep() {
        System.out.println(this.name + " zzZ in house");
    }
    // 메서드 오버로딩 (변경아니고 추가)
    void sleep(int hour) {
        System.out.println(this.name + " zzZ in house for " + hour + " hours.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        dog1.setName("뭉뭉");
        System.out.println(dog1.name);
        dog1.sleep();

        HouseDog1 houseDog1 = new HouseDog1();
        houseDog1.setName("멍멍이");
        houseDog1.sleep();
        houseDog1.sleep(3);
    }
}
