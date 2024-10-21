import java.util.HashSet;
import java.util.Set;

public class Bai2_4_1 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Banana");  // Phần tử trùng lặp, sẽ không được thêm

        System.out.println("HashSet: " + hashSet);  // Không đảm bảo thứ tự
    }
}
