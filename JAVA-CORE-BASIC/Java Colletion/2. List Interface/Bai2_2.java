import java.util.ArrayList;

public class Bai2_2 {
    public static void main(String[] args) {
        // Tạo một ArrayList lưu trữ các chuỗi
        ArrayList<String> languages = new ArrayList<>();

        // Thêm phần tử vào ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        // Truy cập phần tử theo chỉ số
        System.out.println("Phần tử thứ nhất: " + languages.get(0)); // Java

        // Thêm phần tử tại vị trí 1
        languages.add(1, "JavaScript");

        // In ra toàn bộ danh sách
        System.out.println("Các ngôn ngữ lập trình:");
        for (String lang : languages) {
            System.out.println(lang);
        }

        // Xóa phần tử tại vị trí 2
        languages.remove(2);

        System.out.println("Sau khi xóa phần tử:");
        for (String lang : languages) {
            System.out.println(lang);
        }
    }
}
