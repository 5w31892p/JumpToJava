package practicequestions;

import java.util.*;

public class Quiz03 {
    public static void main(String[] args) {
        // 자료형 연습문제
        // 평균점수 구하기 (길동씨)
        int i = 80;
        int j = 75;
        int k = 55;
        int average = (i + j + k) / 3;
        System.out.println(average); // 70

        // 홀수 짝수 판별 (자연수 13)
        int t = 13;
        if (t % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        // 주민등록번호 나누기
        String num = "881120-1068234";
        System.out.println("주민등록번호 앞자리 : " + num.substring(0, 6));
        System.out.println("주민등록번호 뒷자리 : " + num.substring(7, 13));

        // 주민등록 번호 인덱싱
        String pin = "881120-1068234";
        System.out.println(pin.charAt(7)); // ㅜㅜ

        // 문자열 바꾸기
        // a:b:c:d -> a#b#c#d
        String a = "a:b:c:d";
        System.out.println(a.replace(":", "#"));

        // 리스트 역순 정렬하기
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2)); // ㅠ
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);

        // 리스트를 문자열로
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short")); // ㅜㅜ
        String list = String.join(" ",arrayList);
        System.out.println(list);

        // 맵에서 값 추출하기
        // B 값 추출 후 B 해당 아이템 사라져야 함
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        System.out.println(grade.remove("B"));
        System.out.println(Arrays.asList(grade));

        // 중복 숫자 제거
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5)); //ㅠ
        HashSet<Integer> numbers2 = new HashSet<>(numbers);
        ArrayList<Integer> result = new ArrayList<>(numbers2);
        System.out.println(result);

    }
}
