package practicequestions.oopquiz05;

// 객체변수  value 100보다 큰 값 가질 수 없도록 제한하는 계산기
class Calculators {
    int value;

    Calculators() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

class MaxLimitCalculators extends Calculator { // ㅜㅜ
    void add(int val) {
        this.value += val;
        if (this.value > 100) {
            this.value = 100;
        }
    }
}

public class MaxLimitCalculator {
    public static void main(String[] args) {
        MaxLimitCalculators cal = new MaxLimitCalculators();
        cal.add(50);  // 50 더하기
        cal.add(60);  // 60 더하기
        System.out.println(cal.getValue());  // 100 출력
    }
}
