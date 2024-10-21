public class Bai1_2 {
        public static void main(String[] args) {
            // Cách tạo String
            String str1 = "Hello, World!"; // Sử dụng dấu nháy kép
            String str2 = new String("Hello, World!"); // Sử dụng lớp String
            String str3 = String.valueOf(123); // Chuyển đổi số thành chuỗi

            // Tính chất bất biến
            str1 = str1.toUpperCase(); // Tạo ra một đối tượng String mới
            System.out.println("str1 sau khi chuyển đổi: " + str1); // Kết quả: HELLO, WORLD!

            // So sánh chuỗi
            System.out.println("So sánh str1 và str2 bằng .equals(): " + str1.equals(str2)); // Kết quả: false
            System.out.println("So sánh str1 và str3 bằng .equals(): " + str1.equals(str3)); // Kết quả: false
        }
    }

