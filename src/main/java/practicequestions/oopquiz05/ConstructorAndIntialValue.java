package practicequestions.oopquiz05;

import javax.swing.*;

// 아래 코드 오류 발생하는데 코드 오류를 수정해라
class Calculator3 {
    Integer value;

    // Integer  자료형은 값을 대입 하지 않으면 null이기 때문에
    // 아래와 같이 생성자 만들고 초깃값 설정해야 한다.
    Calculator3() {
        this.value = 0;
    }
    void add(int val) {
        this.value += val;
    }

    public int getValue() {
        return this.value;
    }
}

public class ConstructorAndIntialValue {
    public static void main(String[] args) {
        Calculator3 cal = new Calculator3(); // 여기서 NullPointerException 이 발생한다.
        cal.add(3);
        System.out.println(cal.getValue());
    }
}
