package datatype;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        //교집합
        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println(intersection);
        // 합집합
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);
        //차집합
        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2);
        System.out.println(substract);

        // HashSet & LinkedHashSet & TreeSet
        // 공통점 : 중복 허용 안함
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("a", "B", "E", "d", "c", "a"));
        System.out.println(hashSet); // 엉망진창

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("a", "B", "E", "d", "c", "a"));
        System.out.println(linkedHashSet); // 넣은 순서대로

        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("a", "B", "E", "d", "c", "a"));
        System.out.println(treeSet); // 오름차순(대문자 먼저)
    }
}
