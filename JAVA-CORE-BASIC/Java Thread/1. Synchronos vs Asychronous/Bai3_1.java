public class Bai3_1 {
    public static void main(String[] args) {
        System.out.println("Bắt đầu");

        try {
            // Chương trình sẽ dừng 2 giây tại đây trước khi tiếp tục
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Kết thúc");
    }
}