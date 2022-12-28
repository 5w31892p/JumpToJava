package practicequestions.oopquiz05;

// 광물 가치 계산기
// 금 100, 은 90, 구리 80 더하기 기능 (add 메소드)
// 인터페이스 만들어 구현하기

interface Calculation {
    int getMineralValue();

}

class Gold implements Calculation {
    public int getMineralValue() {
        return 100;
    }
}

class Silver implements Calculation {
    public int getMineralValue() {
        return 90;
    }
}

class Bronze implements Calculation {
    public int getMineralValue() {
        return 80;
    }
}

class MineralCalculator {
    int value = 0;

    public void add(Calculation calculation) {
        this.value += calculation.getMineralValue();
    }

    public int getValue() {
        return this.value;
    }
}

public class InterfaceUse {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
    }
}
