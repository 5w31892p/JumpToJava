import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("red", "빨강");
        map.put("blue", "파랑");
        map.put("pink", "분홍");
        System.out.println(map.get("pink"));
        System.out.println(map.containsKey("black"));
        System.out.println(map.size());
        System.out.println(map.keySet()); // set자료형으로 모든 key 리턴
        System.out.println(map.remove("pink"));
        System.out.println(map.keySet());

        // LinkedHashMap : 입력 순서대로 저장
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("pink", "분홍");
        linkedHashMap.put("blue", "파랑");
        linkedHashMap.put("red", "빨강");
        System.out.println(linkedHashMap.keySet());

        // TreeMap : key 오른차 순서대로 저장
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("red", "빨강");
        treeMap.put("blue", "파랑");
        treeMap.put("pink", "분홍");
        System.out.println(treeMap.keySet());
    }
}
