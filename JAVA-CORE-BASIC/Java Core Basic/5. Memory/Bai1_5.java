public class Bai1_5 {
    public static void main(String[] args) {
        int num = 10; // Cấp phát tĩnh, lưu trữ trong stack

        // Cấp phát động, lưu trữ trong heap
        Integer obj = new Integer(20);

        // In ra giá trị
        System.out.println("Num: " + num); // Stack memory
        System.out.println("Obj: " + obj); // Heap memory
    }
}
