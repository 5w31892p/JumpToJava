package controlstatement;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {

        // foreach문은 직관적
        // 배열과 리스트만 가능함
        String[] num = {"하나", "둘", "셋"};
        for (String number : num) {
            System.out.println(number);
        }
        System.out.println("-----------");

        ArrayList<String> n = new ArrayList<>(Arrays.asList("하나", "둘", "셋"));
        System.out.println(n);
        for (String numbers : n) {
            System.out.println(numbers);
        }
    }
}
