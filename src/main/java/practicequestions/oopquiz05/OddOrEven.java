package practicequestions.oopquiz05;

// 홀수 짝수 판별하기
// 주어진 정수가 홀수인지 짝수인지 판별해주는 Calculator
class Calculator1 {
    boolean isOdd (int val) {
        return val % 2 == 1;
//        if (val % 2 == 1) {
//            return true;
//        }
//        return false;
    }

}

public class OddOrEven {
    public static void main(String[] args) {
        Calculator1 cal = new Calculator1();
        System.out.println(cal.isOdd(3));  // 3은 홀수이므로 true 출력
        System.out.println(cal.isOdd(4));  // 4는 짝수이므로 false 출력
    }
}
