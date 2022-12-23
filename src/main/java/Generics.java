import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Generics {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> num = new ArrayList<>(Arrays.asList("1", "2", "3"));
        System.out.println(num.size()); // 길이
        System.out.println(num.contains("3")); // 해당 값 있는지 확인
        System.out.println(num.remove(1)); //  인덱스로 삭제
        System.out.println(num.remove("1")); // 객체로 삭제

        // Generics - String.join
        // 콤마로 구분하여 하나로 문자열로 만들기
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("1", "2", "3"));
//        String result = "";
//        for (int i = 0; i < pitches.size(); i++) {
//            result += pitches.get(i);
//            result += ",";
//        }
//        result = result.substring(0, result.length() - 1); // -1은 마지막 콤마 제거
        String result = String.join(",",pitches);
        System.out.println(result);

        // 리스트 정렬
        ArrayList<String> number = new ArrayList<>(Arrays.asList("1", "2", "3"));
        number.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println(number);
        number.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(number);


    }
}
