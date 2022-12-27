package oop;

class Animal1 { // 껍데기 뿐인 class지만 아래와 같이 객체 만드는 기능이 있다.
    String name; // 객체 변수(== 인스턴스 변수, 멤버 변수, 속성)

    public void setName(String name) {
        this.name = name;
    }
}

public class Class {
    public static void main(String[] args) {
        // new는 객체 생성 키워드
        Animal1 cat = new Animal1();
        Animal1 dog = new Animal1();

        // 메서드 호출
        cat.setName("야옹이");
        dog.setName("멍멍이");

        System.out.println(cat.name);
        System.out.println(dog.name);
    }
}
