package practicequestions.oopquiz05;

// 오류 발생하는 문장 찾고 오류 원인 설명
interface Predator {
}

class Animal {
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
}
public class FindError1 {
    public static void main(String[] args) {
        Animal a = new Animal();  // Animal is a Animal
        Animal b = new Dog();  // Dog is a Animal
        Animal c = new Lion();  // Lion is a Animal
//        Dog d = new Animal();  // Animal is a Dog
        Predator e = new Lion();  // Lion is a Predator
    }
    // 나머지는 다 Animal에 포함되는 것을 가르키는 문장인데
    // Dog d = new Animal();는 동물이 개에 포함된다고 하고 있으므로 오류이다.
    // 즉, d를 제외한 나머지 문장은 IS-A 관계가 성립한다.
}
