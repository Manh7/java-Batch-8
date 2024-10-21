import java.util.PriorityQueue;
import java.util.Queue;

public class Bai2_3 {
    public static void main(String[] args) {
        // Tạo một PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Thêm các phần tử vào hàng đợi
        priorityQueue.offer(5);
        priorityQueue.offer(1);
        priorityQueue.offer(3);
        priorityQueue.offer(2);

        // In ra hàng đợi
        System.out.println("Hàng đợi ưu tiên (PriorityQueue): " + priorityQueue);

        // Lấy và xóa phần tử ưu tiên cao nhất (nhỏ nhất)
        System.out.println("Lấy phần tử đầu tiên: " + priorityQueue.poll());

        // Lấy phần tử ưu tiên cao nhất còn lại mà không xóa
        System.out.println("Phần tử ưu tiên tiếp theo (không xóa): " + priorityQueue.peek());

        // In hàng đợi sau khi xóa
        System.out.println("Hàng đợi sau khi xóa: " + priorityQueue);
    }
}
