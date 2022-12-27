package oop;

public class Method {
    // 1. 입력, 출력 모두 있는 메서드 (일반적인 메서드)
    int sum(int a, int b) { // a, b -> 매개변수 (매서드에 전달된 값 저장하는 변수)
        return a + b;
    }
    // 2. 출력만 있는
    String say() {
        return "Hi";
    }
    // 3. 입력만 있는
    void sum2(int x, int y) {
        System.out.println(x + "과 " + y + "의 합은 " + (x + y) + "입니다.");
    }
    // 4. 입출력 모두 없는
    void sayYse() {
        System.out.println("Hi");
    }
    ////////////////////////////////////////////////////////

    void sayNick(String nick) {
        if ("fool".equals(nick)) {
            return; // fool 나오면 메서드 빠져나가기 (void 메서드에서만 가능)
        }
        System.out.println("나의 별명은 "+nick+" 입니다.");
    }

    ////////////////////////////////////////////////////////

    void varTest(int i) {
        i++;
    }

    int varTests(int j) {
        j++;
        return j;
    }

    int k;
    void varTestss(Method method) {
        method.k++;
    }

    ////////////////////////////////////////////////////////

    int m;
    void vvarTest() {
        this.m++;
    }

    public static void main(String[] args) {
        Method method = new Method();

        // 1. 입, 출력 모두
        int c = method.sum(3, 5); // 3, 5 -> 인수 (메서드에 전달하는 값)
        System.out.println(c); // 7
        // 2. 출력만
        String a = method.say();
        System.out.println(a); // Hi
        // 3. 입력만
        method.sum2(4, 5); // 4과 5의 합은 9입니다.
        // 4. 입출력 모두 없..
        method.sayYse(); // Hi

        ////////////////////////////////////////////////////////

        method.sayNick("angel");
        method.sayNick("fool");  // 출력되지 않는다.

        ////////////////////////////////////////////////////////

        int i = 1;
        method.varTest(i);
        System.out.println(i); // 1

        int j = 1;
        j = method.varTests(j);
        System.out.println(j); // 2

        method.k = 1;
        method.varTestss(method);
        System.out.println(method.k); // 2

        ////////////////////////////////////////////////////////

        method.m = 1;
        method.vvarTest();
        System.out.println(method.m); // 2
    }
}
