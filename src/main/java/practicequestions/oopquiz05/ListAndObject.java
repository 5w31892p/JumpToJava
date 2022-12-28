package practicequestions.oopquiz05;

// 출력 결과 예측하기


import java.util.ArrayList;
import java.util.Arrays;

public class ListAndObject {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
//        ArrayList<Integer> b = new ArrayList<>(a);
//        -> b가 a와 동일한 값을 가지지만 독립적으로 생성하고 싶을 때
//        이렇게 하게되면 아래와 같은 경우 a에 추가해서 size가 늘어났지만
//        b는 변화가 없고 a==b도 false를 반환한다.

        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());
        // a와 b는 모두 동일한 list 객체를 가르키고 있기 떄문에 a = b이다.
        // 그러므로 a.add(4)를해서 a의 size가 4로 늘어났다면 b의 size도 4이다.
        System.out.println(a==b); // true
    }
}
