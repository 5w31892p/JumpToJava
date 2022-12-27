package oop;

class Animal3 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog2 extends Animal3 {
    // 기본 생성자
    Dog2() {
    }

    void sleep() {
        System.out.println(this.name + " zzZ");
    }
}


class HouseDog2 extends Dog2 {

    // 생성자
    HouseDog2(String name) {
        this.setName(name);
    }

    // 생성자 오버로딩
    HouseDog2(int type) {
        if (type == 1) {
            this.setName("뭉뭉1");
        } else if (type == 2) {
            this.setName("뭉뭉2");
        }
    }

    // 메서드 오버라이딩 (내용만 조금 변경 후 재구현)
    void sleep() {
        System.out.println(this.name + " zzZ in house");
    }

    // 메서드 오버로딩 (변경아니고 추가)
    void sleep(int hour) {
        System.out.println(this.name + " zzZ in house for " + hour + " hours.");
    }
}

public class Constructor {
    public static void main(String[] args) {
        HouseDog2 dog2 = new HouseDog2("왈왈이");
        HouseDog2 houseDog2 = new HouseDog2(1);
        System.out.println(dog2.name);
        System.out.println(houseDog2.name);


    }
}
