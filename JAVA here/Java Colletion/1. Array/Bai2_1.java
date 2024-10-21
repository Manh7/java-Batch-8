public class Bai2_1 {
        public static void main(String[] args) {
            // Khai báo và khởi tạo mảng số nguyên với 5 phần tử
            int[] numbers = new int[5];

            // Gán giá trị cho các phần tử trong mảng
            numbers[0] = 10;
            numbers[1] = 20;
            numbers[2] = 30;
            numbers[3] = 40;
            numbers[4] = 50;

            // In ra các giá trị của mảng bằng cách duyệt qua chỉ số của mảng
            System.out.println("Các phần tử trong mảng:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Phần tử tại index " + i + ": " + numbers[i]);
            }

            // Tính tổng các phần tử trong mảng
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("Tổng của các phần tử trong mảng: " + sum);
        }

}
