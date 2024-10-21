public class Bai1_6 {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (CustomCheckedException e) {
            System.out.println(e.getMessage());
        }
    }

    // Phương thức ném ra ngoại lệ tùy chỉnh
    public static void validateAge(int age) throws CustomCheckedException {
        if (age < 18) {
            throw new CustomCheckedException("Tuổi phải từ 18 trở lên.");
        }
    }
}
