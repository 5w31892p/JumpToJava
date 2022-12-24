package datatype;

import java.util.List;

public class TypeConversionAndFinal {
    public static void main(String[] args) {
        // 문자열 ->  정수
        String n = "123";
        int num = Integer.parseInt(n);
        System.out.println(num);

        // 정수 -> 문자열
        int s = 123123;
        String snum = "" + s;
        String snum1 = String.valueOf(s);
        String snum2 = Integer.toString(s);
        System.out.println(snum);
        System.out.println(snum1);
        System.out.println(snum2);

        // 문자 -> 실수
        // 실수가 아닌 int로 바꾸려고 하면 NumberFormatException
        String d = "123.23";
        double dd = Double.parseDouble(d);
        System.out.println(dd);

        // 정수 -> 실수
        int n1 = 123;
        double d1 = n1;
        System.out.println(d1);

        // 실수 -> 정수
        // 캐스팅
        double d2 = 123.667;
        int n2 = (int) d2;
        System.out.println(n2);

        // List를 final 선언하면 재할당만 안될 뿐 add, remove 가능함
        // add 나 remove도 못하게 하고 싶다면 List.of로 -> Unmodifiable List (수정 불가능 리스트), null 들어오면 NullPointerException
    }
}
