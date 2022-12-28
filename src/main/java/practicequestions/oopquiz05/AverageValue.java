package practicequestions.oopquiz05;

import java.util.ArrayList;
import java.util.Arrays;

// 평균값 구하는 메서드
// 정수 배열 또는 정수 리스트로 평균값 구해 리턴하는 Calculator 클래스 작성
class Calculator2 { // nn
    int avg(int[] data) {
        int total = 0;
        for (int num : data) {
            total += num;
        }
        return total/data.length;
    }

    int avg(ArrayList<Integer> data) {
        int total = 0;
        for (int num : data) {
            total += num;
        }
        return total/data.size();
    }
}
public class AverageValue {
    public static void main(String[] args) {
        Calculator2 cal = new Calculator2();

        int[] data = {1, 3, 5, 7, 9};
        int result = cal.avg(data);
        System.out.println(result);

        ArrayList<Integer> datas = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int results = cal.avg(datas);
        System.out.println(results);  // 5 출력
    }
}
