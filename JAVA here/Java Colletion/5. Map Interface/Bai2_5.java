import java.util.Map;
import java.util.TreeMap;

public class Bai2_5 {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("B", 2);
        treeMap.put("A", 1);
        treeMap.put("D", 4);
        treeMap.put("C", 3);

        System.out.println("TreeMap (sắp xếp theo thứ tự khóa): " + treeMap);
    }
}